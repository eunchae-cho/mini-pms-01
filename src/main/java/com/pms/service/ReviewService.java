package com.pms.service;

import java.util.List;

import com.pms.domain.Review;

public interface ReviewService {

  List<Review> list() throws Exception;

//  List<User> list(String keyword, int pageNo, int pageSize) throws Exception;
//
//  int size(String keyword) throws Exception;
//
//  int update(User user) throws Exception;
//
//  int delete(int no) throws Exception;
//
//  User get(int no) throws Exception;
//
//  User get(String email, String password) throws Exception;
//
//  int add(User user) throws Exception;
}
