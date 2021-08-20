package com.dio.firstproject.controller;

import com.dio.firstproject.models.CompTime;
import com.dio.firstproject.service.CompTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banco-horas")
public class CompTimeController {

    @Autowired
    CompTimeService compTimeService;

    public CompTime createCompTime(@RequestBody CompTime compTime){
        return compTimeService.create(compTime);
    }

}
