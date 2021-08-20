package com.dio.firstproject.controller;

import com.dio.firstproject.models.JobWorkdays;
import com.dio.firstproject.service.JobWorkdaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JobWorkdaysController {

    @Autowired
    JobWorkdaysService jobWorkdaysService;

    @PostMapping
    public JobWorkdays createWorkdays(@RequestBody JobWorkdays jobWorkdays){
        return jobWorkdaysService.create(jobWorkdays);
    }

    @GetMapping
    public List<JobWorkdays> getWorkdaysList(){
        return jobWorkdaysService.findAll();
    }

    @GetMapping("/{idWorkdays}")
    public ResponseEntity<JobWorkdays> getWorkdaysById(@PathVariable("idWorkdays") Long idWorkdays) {
        return ResponseEntity.ok(
                jobWorkdaysService.getById(idWorkdays)
                        .orElseThrow(NoSuchElementException::new));
    }
    @DeleteMapping("/{idWorkdays}")
    public ResponseEntity deleteWorkdaysById(@PathVariable("idWorkdays") Long idWorkdays){
        try{
            jobWorkdaysService.delete(idWorkdays);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity) ResponseEntity.ok();
    }

    @PutMapping
    public JobWorkdays updateWorkdays(@RequestBody JobWorkdays jobWorkdays){
        return jobWorkdaysService.update(jobWorkdays);
    }
}
