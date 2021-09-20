package com.user.user.facade;

import java.util.List;
import java.util.Optional;

import com.user.user.model.User;

public interface UserFacade {
  public List<User> getUsers();

  public User saveUser(User user);

  public Optional<User> login(String userName, String password);
}
