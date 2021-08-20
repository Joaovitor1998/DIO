package com.dio.firstproject.controller;

import com.dio.firstproject.models.Locality;
import com.dio.firstproject.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidade")
public class LocalityController {

    @Autowired
    LocalityService localityService;

    public Locality createLocality(@RequestBody Locality locality){
        return localityService.create(locality);
    }
}
