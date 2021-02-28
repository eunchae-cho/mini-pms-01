package com.pms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pms.dao.UserDao;
import com.pms.domain.User;
import com.pms.service.UserService;

@Service
public class DefaultUserService implements UserService {



  @Autowired
  UserDao userDao;

  @Override
  public int add(User user) throws Exception {
    return userDao.insert(user);
  }

  @Override
  public List<User> list() throws Exception {
    return userDao.findAll(null);
  }


}
