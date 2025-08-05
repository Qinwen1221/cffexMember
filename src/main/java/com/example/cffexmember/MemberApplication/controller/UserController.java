package com.example.cffexmember.MemberApplication.controller;

import com.example.cffexmember.MemberApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return userService.userLogin(username, password);
    }
}
