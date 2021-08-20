package com.dio.firstproject.repository;

import com.dio.firstproject.models.CompTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompTimeRespository extends JpaRepository<CompTime, Long> {
}
