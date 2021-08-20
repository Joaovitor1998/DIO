package com.dio.firstproject.controller;

import com.dio.firstproject.models.DataType;
import com.dio.firstproject.service.DataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipo-dado")
public class DataTypeController {

    @Autowired
    DataTypeService dataTypeService;

    public DataType createDataType(@RequestBody DataType dataType){
        return dataTypeService.create(dataType);
    }

}
