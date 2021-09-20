package com.user.user.repository;

import java.util.Optional;

import com.user.user.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

  public Optional<User> findByUserNameAndPassWord(String userName, String password);
}
