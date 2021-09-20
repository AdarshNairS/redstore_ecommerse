package com.user.user.facade;

import java.util.List;
import java.util.Optional;

import com.user.user.model.User;
import com.user.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFacadeImpl implements UserFacade {

  @Autowired
  private UserService userService;

  @Override
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @Override
  public User saveUser(User user) {
    return userService.saveUser(user);
  }

  @Override
  public Optional<User> login(String userName, String password) {

    return userService.login(userName, password);
  }

}
