package com.dio.firstproject.service;

import com.dio.firstproject.models.Locality;
import com.dio.firstproject.repository.LocalityRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalityService {

    @Autowired
    LocalityRespository localityRespository;

    public Locality create(Locality locality){
        return localityRespository.save(locality);
    }
}
