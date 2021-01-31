package com.pms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.pms.domain.User;
import com.pms.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes("loginUser")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("form")
  public void form() {}

  @PostMapping("add")
  public String add(String name, String nick, String email, String password) throws Exception {

    User user = new User();
    user.setName(name);
    user.setNick(nick);
    user.setEmail(email);
    user.setPassword(password);
    user.setPhoto("9fa1194f-3d02-4daa-b503-95f17757d495");

    userService.add(user);
    return "redirect:../index";
  }

  @GetMapping("delete")
  public String delete(@ModelAttribute("loginUser") User loginUser) throws Exception {
    if (loginUser == null) {
      throw new Exception("로그인 정보가 존재하지 않습니다.");
    }
    if (userService.delete(loginUser.getUserNo()) == 0) {
      throw new Exception("회원 탈퇴를 실패하였습니다.");
    }
    return "redirect:app/index";
  }

  @GetMapping("list")
  public void list(String keyword, @RequestParam(defaultValue = "1") int pageNo,
      @RequestParam(defaultValue = "5") int pageSize, Model model) throws Exception {

    if (pageNo < 1) {
      pageNo = 1;
    }
    if (pageSize < 3 || pageSize > 100) {
      pageSize = 5;
    }

    model.addAttribute("list", userService.list(keyword, pageNo, pageSize));

    int size = userService.size(keyword);
    int totalPage = size / pageSize;
    if (size % pageSize > 0) {
      totalPage++;
    }

    int prevPageNo = pageNo > 1 ? pageNo - 1 : 1;
    int nextPageNo = pageNo + 1;
    if (nextPageNo > totalPage) {
      nextPageNo = totalPage;
    }

    model.addAttribute("currPageNo", pageNo);
    model.addAttribute("prevPageNo", prevPageNo);
    model.addAttribute("nextPageNo", nextPageNo);
    model.addAttribute("totalPage", nextPageNo);
    model.addAttribute("size", size);
    model.addAttribute("pageSize", pageSize);
    model.addAttribute("keyword", keyword);
  }


}
