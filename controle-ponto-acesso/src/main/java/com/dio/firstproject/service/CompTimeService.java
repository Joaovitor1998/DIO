package com.dio.firstproject.service;

import com.dio.firstproject.models.CompTime;
import com.dio.firstproject.repository.CompTimeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompTimeService {

    @Autowired
    CompTimeRespository compTimeRespository;

    public CompTime create(CompTime compTime){
        return compTimeRespository.save(compTime);
    }
}
