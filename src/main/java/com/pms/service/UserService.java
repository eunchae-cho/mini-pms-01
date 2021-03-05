package com.pms.service;

import java.util.List;
import com.pms.domain.User;

public interface UserService {

  List<User> list() throws Exception;

  int add(User user) throws Exception;

}
