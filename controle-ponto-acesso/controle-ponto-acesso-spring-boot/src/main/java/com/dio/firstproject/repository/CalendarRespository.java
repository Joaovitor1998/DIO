package com.dio.firstproject.repository;

import com.dio.firstproject.models.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRespository extends JpaRepository<Calendar, Long> {
}
