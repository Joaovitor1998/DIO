package com.dio.firstproject.controller;

import com.dio.firstproject.models.UserCategory;
import com.dio.firstproject.service.UserCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria-usuario")
public class UserCategoryController {

    @Autowired
    UserCategoryService userCategoryService;

    public UserCategory createUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.create(userCategory);
    }
}
