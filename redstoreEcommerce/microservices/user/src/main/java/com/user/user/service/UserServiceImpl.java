package com.user.user.service;

import java.util.List;
import java.util.Optional;

import com.user.user.model.User;
import com.user.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @Override
  public User saveUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public Optional<User> login(String userName, String password) {
    Optional<User> user = userRepository.findByUserNameAndPassWord(userName, password);
    return user;
  }

}
