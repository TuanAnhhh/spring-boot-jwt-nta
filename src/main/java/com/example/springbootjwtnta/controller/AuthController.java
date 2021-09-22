package com.example.springbootjwtnta.controller;


import com.example.springbootjwtnta.entity.User;
import com.example.springbootjwtnta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public User register(@RequestBody User user){

        return userService.createUser(user);
    }
}
