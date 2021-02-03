package com.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pms.dao.CommentDao;
import com.pms.domain.Comment;
import com.pms.service.CommentService;

@Service
public class DefaultCommentService implements CommentService {

  CommentDao commnetDao;

  public DefaultCommentService(CommentDao commnetDao) {
    this.commnetDao = commnetDao;
  }


  @Override
  public List<Comment> list() throws Exception {
    return commnetDao.findAll(null);
  }

 
}
