package com.user.user.controller;

import java.util.List;

import com.user.user.facade.UserFacade;
import com.user.user.model.RestResponse;
import com.user.user.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Autowired
  private UserFacade userFacade;

  @GetMapping()
  public ResponseEntity<RestResponse> getUsers() {
    List<User> users = userFacade.getUsers();
    return new ResponseEntity<>(new RestResponse(Boolean.TRUE, "user listed Successfully", users, null), HttpStatus.OK);
  }

  @PostMapping()
  public ResponseEntity<RestResponse> saveUser(@RequestBody User user) {
    User savedUser = userFacade.saveUser(user);
    return new ResponseEntity<>(new RestResponse(Boolean.TRUE, "user added successfully", savedUser, null),
        HttpStatus.OK);

  }

}
