package com.dio.firstproject.repository;

import com.dio.firstproject.models.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRespository extends JpaRepository<Enterprise, Long> {
}
