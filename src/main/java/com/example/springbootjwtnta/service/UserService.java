package com.example.springbootjwtnta.service;

import com.example.springbootjwtnta.authen.UserPrincipal;
import com.example.springbootjwtnta.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
