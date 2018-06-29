package com.example.Java_Poc.service;

import com.example.Java_Poc.Repo.UserRepo;
import com.example.Java_Poc.model.User;
import com.example.Java_Poc.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;


    public int addUser(User user) {
        int retVal;
        if((retVal = validate(user)) == 0)
          userRepo.save(user);
        return retVal;
    }

    public List<User> getAllusers() {
        List<User> user = new ArrayList<>();
        userRepo.findAll().forEach(user::add);
        return user;
    }

    public int validate(User user){
        int retVal;
        if((retVal = Validator.validateName(user.getName())) == 0)
            if ((retVal = Validator.validatePhoneNumber(String.valueOf(user.getPhoneNumber()))) == 0)
                if ((retVal = Validator.validateEmail(String.valueOf(user.getEmail()))) == 0)
                    if ((retVal = Validator.validatepassword(String.valueOf(user.getPassword()))) == 0)
                        if ((retVal = Validator.validateanuual(String.valueOf(user.getAnnualIncome()))) == 0)
                            if ((retVal = Validator.validateDate(String.valueOf(user.getDateOfBirth()))) == 0)
                return 0;
        return retVal;
    }

}
