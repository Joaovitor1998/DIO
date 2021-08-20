package com.dio.firstproject.repository;

import com.dio.firstproject.models.JobWorkdays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobWorkdaysRepository extends JpaRepository<JobWorkdays, Long> {
}
