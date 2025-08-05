package com.example.cffexmember.MemberApplication.service.impl;

import com.example.cffexmember.MemberApplication.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String userLogin(String username, String password) {
        if ("zhangsan".equals(username) && "1111111".equals(password)) {
            return "Login successful!";
        } else {
            return "Invalid username or password!";
        }
    }
}

