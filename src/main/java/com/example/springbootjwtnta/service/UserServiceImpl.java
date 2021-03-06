package com.example.springbootjwtnta.service;

import com.example.springbootjwtnta.authen.UserPrincipal;
import com.example.springbootjwtnta.entity.User;
import com.example.springbootjwtnta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;
    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public UserPrincipal findByUsername(String username) {
        User user = userRepo.findByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal();

        if (null != user) {

            userPrincipal.setUserId(user.getId());
            userPrincipal.setUsername(user.getUsername());
            userPrincipal.setPassword(user.getPassword());

        }

        return userPrincipal;
    }
}
