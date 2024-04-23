package com.example.jenkins.controller;

import com.example.jenkins.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public ResponseEntity<User> getUsers(){
        User user = new User("Tester", "12313123");

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(user);
    }

}
