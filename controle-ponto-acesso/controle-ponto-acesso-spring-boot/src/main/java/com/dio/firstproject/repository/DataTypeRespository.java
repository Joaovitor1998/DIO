package com.dio.firstproject.repository;

import com.dio.firstproject.models.DataType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataTypeRespository extends JpaRepository<DataType, Long> {
}
