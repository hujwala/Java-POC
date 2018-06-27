package com.example.Java_Poc.service;

import com.example.Java_Poc.Repo.UserRepo;
import com.example.Java_Poc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;


    public User addUser(User user) {
        User saveUser = userRepo.save(user);
        return saveUser;
    }

    public List<User> getAllusers() {
        List<User> user = new ArrayList<>();
        userRepo.findAll().forEach(user::add);
        return user;
    }
}
