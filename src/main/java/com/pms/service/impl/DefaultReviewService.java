package com.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pms.dao.ReviewDao;
import com.pms.domain.Review;
import com.pms.service.ReviewService;

@Service
public class DefaultReviewService implements ReviewService {

   ReviewDao reviewDao;

  public DefaultReviewService(ReviewDao reviewDao) {
    this.reviewDao = reviewDao;
  }


  @Override
  public List<Review> list() throws Exception {
    return reviewDao.findAll();
  }


}
