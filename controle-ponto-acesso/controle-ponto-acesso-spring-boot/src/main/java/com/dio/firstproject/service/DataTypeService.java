package com.dio.firstproject.service;

import com.dio.firstproject.models.DataType;
import com.dio.firstproject.repository.DataTypeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataTypeService {

    @Autowired
    DataTypeRespository dataTypeRespository;

    public DataType create(DataType dataType){
        return dataTypeRespository.save(dataType);
    }

}
