package com.dio.firstproject.service;

import com.dio.firstproject.models.Enterprise;
import com.dio.firstproject.repository.EnterpriseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {

    @Autowired
    EnterpriseRespository enterpriseRespository;

    public Enterprise create(Enterprise enterprise){
        return enterpriseRespository.save(enterprise);
    }
}
