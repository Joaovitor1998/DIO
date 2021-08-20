package com.dio.firstproject.controller;

import com.dio.firstproject.models.Calendar;
import com.dio.firstproject.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calendario")
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    public Calendar createCalendar(@RequestBody Calendar calendar){
        return calendarService.create(calendar);
    }
}
