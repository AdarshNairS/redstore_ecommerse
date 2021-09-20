package com.user.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("user")
public class User {
  @Id
  private String id;
  private String userName;
  private String passWord;
  private String email;

}
