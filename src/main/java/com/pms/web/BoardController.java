package com.pms.web;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pms.domain.Board;
import com.pms.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
  @Autowired
  BoardService boardService;

  @GetMapping("list")
  public void list(Model model, HttpSession session) throws Exception {
    List<Board> list = boardService.list();
    model.addAllAttributes(list);
  }

}
