package com.junitTest.junittest.user.controller;

import com.junitTest.junittest.user.model.User;
import com.junitTest.junittest.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/get")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getAllActive/{email}")
    public User getAllUser(String email){
        return userService.findByUserId(email);
    }
}

