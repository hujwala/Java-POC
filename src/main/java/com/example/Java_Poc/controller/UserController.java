package com.example.Java_Poc.controller;

import com.example.Java_Poc.model.User;
import com.example.Java_Poc.service.UserService;
import com.example.Java_Poc.utils.Validator;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.logging.Logger;

@RestController
@Configuration
@PropertySource("classpath:Messages.properties")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    Environment env;


    @PostMapping(value="/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody User addUser(@RequestBody User user  ){
        int retVal = 0;
        String errMsg;
        String success;
        StringBuilder sb = new StringBuilder("");
        retVal = userService.addUser(user);
            //save the user
            if(retVal == 0) {
                //prepare the success message and set response code
                errMsg = env.getProperty("user." + 3);
                success="true";
                sb.append("{'user':{},").append("'message':'").append(errMsg).append("','success':'").append(success).append("'}");
                user.setMessage(sb.toString());
                //return "{" + user.toString() + "," + "'message':'" + errMsg + "','success':'" + success + "'}";
                return user;
            } else {
                errMsg = env.getProperty("user." + retVal);
                success="false";
                sb.append("{'user':{},").append("'message':'").append(errMsg).append("','success':'").append(success).append("'}");
                user.setMessage(sb.toString());
                //return "{'user':{}," + "'message':'" + errMsg + "','success':'" + success + "'}";
                return user;
        }
    }

    @GetMapping("/users")
    public List<User> getAlluser() {
        return userService.getAllusers();
    }
}
