package com.pms.dao;

import java.util.List;
import java.util.Map;

import com.pms.domain.Comment;

public interface CommentDao {

  List<Comment> findAll(Map<String,Object> params) throws Exception;

//  int count(String keyword) throws Exception;
//
//  User findByNo(int no) throws Exception;
//
//  int update(User user) throws Exception;
//
//  int delete(int no) throws Exception;
//
//  int insert(User user) throws Exception;
}
