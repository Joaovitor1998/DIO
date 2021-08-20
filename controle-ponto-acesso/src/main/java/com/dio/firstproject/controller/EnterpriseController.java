package com.dio.firstproject.controller;

import com.dio.firstproject.models.Enterprise;
import com.dio.firstproject.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EnterpriseController {


    @Autowired
    EnterpriseService enterpriseService;

    public Enterprise createEnterprise(@RequestBody Enterprise enterprise){
        return enterpriseService.create(enterprise);
    }
}
