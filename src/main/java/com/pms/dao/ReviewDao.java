package com.pms.dao;

import java.util.List;

import com.pms.domain.Review;

public interface ReviewDao {

  List<Review> findAll() throws Exception;

  // int count(String keyword) throws Exception;
  //
  // User findByNo(int no) throws Exception;
  //
  // int update(User user) throws Exception;
  //
  // int delete(int no) throws Exception;
  //
  // int insert(User user) throws Exception;
}
