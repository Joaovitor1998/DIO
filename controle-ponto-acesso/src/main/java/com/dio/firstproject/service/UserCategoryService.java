package com.dio.firstproject.service;

import com.dio.firstproject.models.UserCategory;
import com.dio.firstproject.repository.UserCategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCategoryService {

    @Autowired
    UserCategoryRespository userCategoryRespository;

    public UserCategory create(UserCategory userCategory){
        return userCategoryRespository.save(userCategory);
    }

}
