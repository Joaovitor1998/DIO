package com.dio.firstproject.controller;

import com.dio.firstproject.models.User;
import com.dio.firstproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @Autowired
    UserService userService;

    public User createUser(@RequestBody User user){
        return userService.create(user);
    }
}
