package com.dio.firstproject.repository;

import com.dio.firstproject.models.AccessLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessLevelRespository extends JpaRepository<AccessLevel, Long> {
}
