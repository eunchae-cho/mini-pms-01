package com.pms.dao;

import java.util.List;
import java.util.Map;
import com.pms.domain.User;

public interface UserDao {

  List<User> findAll(Map<String, Object> params) throws Exception;

  int insert(User user) throws Exception;
}
