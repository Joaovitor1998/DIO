package com.dio.firstproject.controller;

import com.dio.firstproject.models.Occurrence;
import com.dio.firstproject.service.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ocorrencia")
public class OccurrenceController {

    @Autowired
    OccurrenceService occurrenceService;

    public Occurrence createOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.create(occurrence);
    }
}
