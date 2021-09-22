package com.example.springbootjwtnta.service;

import com.example.springbootjwtnta.entity.User;
import com.example.springbootjwtnta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;
    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }
}
