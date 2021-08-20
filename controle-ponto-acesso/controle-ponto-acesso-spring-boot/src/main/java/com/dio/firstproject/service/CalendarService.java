package com.dio.firstproject.service;

import com.dio.firstproject.models.Calendar;
import com.dio.firstproject.repository.CalendarRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {

    @Autowired
    CalendarRespository calendarRespository;

    public Calendar create(Calendar calendar){
        return calendarRespository.save(calendar);
    }

}
