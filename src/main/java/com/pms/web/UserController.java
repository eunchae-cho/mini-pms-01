package com.pms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
  public String add(User user) throws Exception {

    // User user = new User();
    // user.setName(name);
    // user.setNick(nick);
    // user.setEmail(email);
    // user.setPassword(password);

    userService.add(user);
    return "redirect:../index";
  }



}
