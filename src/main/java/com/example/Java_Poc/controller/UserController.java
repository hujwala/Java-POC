package com.example.Java_Poc.controller;

import com.example.Java_Poc.model.User;
import com.example.Java_Poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/user")
    public void addUser(@RequestBody User user  ){
        userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAlluser() {
        return userService.getAllusers();
    }
}
