package com.dio.firstproject.repository;

import com.dio.firstproject.models.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccurrenceRespository extends JpaRepository<Occurrence, Long> {
}
