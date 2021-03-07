package com.pms.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms.domain.Reservation;
import com.pms.service.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
  @Autowired
  ReservationService reservationService;

  @GetMapping("list")
  public void list(Model model, HttpSession session) throws Exception {
    List<Reservation> list = reservationService.list();
    model.addAllAttributes(list);
  }

}
