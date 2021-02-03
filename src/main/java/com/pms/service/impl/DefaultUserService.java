package com.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pms.dao.UserDao;
import com.pms.domain.User;
import com.pms.service.UserService;

@Service
public class DefaultUserService implements UserService {

  UserDao userDao;

  public DefaultUserService(UserDao userDao) {
    this.userDao = userDao;
  }


  @Override
  public List<User> list() throws Exception {
    return userDao.findAll(null);
  }

 
}
