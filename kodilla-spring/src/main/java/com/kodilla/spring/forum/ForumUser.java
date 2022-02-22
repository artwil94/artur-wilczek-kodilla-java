package com.kodilla.spring.forum;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ForumUser {

   private String username;

    public ForumUser() {
    this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
