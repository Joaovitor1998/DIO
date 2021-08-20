package com.dio.firstproject.service;

import com.dio.firstproject.models.AccessLevel;
import com.dio.firstproject.repository.AccessLevelRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AccessLevelService {

    @Autowired
    AccessLevelRespository accessLevelRespository;

    public AccessLevel create(AccessLevel accessLevel){
        return accessLevelRespository.save(accessLevel);
    }

}
