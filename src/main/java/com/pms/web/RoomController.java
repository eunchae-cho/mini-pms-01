package com.pms.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms.domain.Room;
import com.pms.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
  @Autowired
  RoomService roomService;

  @GetMapping("list")
  public void list(Model model, HttpSession session) throws Exception {
    List<Room> list = roomService.list();
    model.addAllAttributes(list);
  }

}
