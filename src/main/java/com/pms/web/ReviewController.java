package com.pms.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms.domain.Review;
import com.pms.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {
  @Autowired
  ReviewService reviewService;

  @GetMapping("list")
  public void list(Model model, HttpSession session) throws Exception {
    List<Review> list = reviewService.list();
    model.addAllAttributes(list);
  }

}
