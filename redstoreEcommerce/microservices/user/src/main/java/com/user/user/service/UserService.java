package com.user.user.service;

import java.util.List;
import java.util.Optional;

import com.user.user.model.User;

public interface UserService {
  public List<User> getUsers();

  public User saveUser(User user);

  public Optional<User> login(String userName, String password);
}