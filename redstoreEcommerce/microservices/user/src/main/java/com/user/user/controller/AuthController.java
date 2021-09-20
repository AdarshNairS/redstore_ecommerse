package com.user.user.controller;

import java.util.Optional;

import com.user.user.facade.UserFacade;
import com.user.user.model.RestResponse;
import com.user.user.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  private UserFacade userFacade;

  @PostMapping()
  public ResponseEntity<RestResponse> login(@RequestBody User user) {
    String userName = user.getUserName();
    String password = user.getPassWord();
    Optional<User> userlogin = userFacade.login(userName, password);
    if (userlogin.isPresent()) {
      return new ResponseEntity<>(new RestResponse(Boolean.TRUE, "user login successfully", userlogin, null),
          HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new RestResponse(Boolean.TRUE, "user not found", null, null), HttpStatus.OK);
    }
  }

}
