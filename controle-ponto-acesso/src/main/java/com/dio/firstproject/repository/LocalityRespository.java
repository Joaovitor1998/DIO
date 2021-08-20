package com.dio.firstproject.repository;

import com.dio.firstproject.models.Locality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalityRespository extends JpaRepository<Locality, Long> {
}
