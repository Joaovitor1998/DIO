package com.dio.firstproject.service;

import com.dio.firstproject.models.User;
import com.dio.firstproject.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRespository userRespository;

    public User create(User user){
        return userRespository.save(user);
    }

}
