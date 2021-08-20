package com.dio.firstproject.service;

import com.dio.firstproject.models.Occurrence;
import com.dio.firstproject.repository.OccurrenceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OccurrenceService {

    @Autowired
    OccurrenceRespository occurrenceRespository;

    public Occurrence create(Occurrence occurrence){
        return occurrenceRespository.save(occurrence);
    }
}
