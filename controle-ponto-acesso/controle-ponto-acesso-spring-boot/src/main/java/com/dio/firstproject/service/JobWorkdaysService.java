package com.dio.firstproject.service;

import com.dio.firstproject.models.JobWorkdays;
import com.dio.firstproject.repository.JobWorkdaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobWorkdaysService {

    @Autowired
    JobWorkdaysRepository jobWorkdaysRepository;

    public JobWorkdays create(JobWorkdays jobWorkdays){
        return jobWorkdaysRepository.save(jobWorkdays);
    }

    public Optional<JobWorkdays> getById(Long idWorkdays) {
        return jobWorkdaysRepository.findById(idWorkdays);
    }

    public List<JobWorkdays> findAll() {
        return jobWorkdaysRepository.findAll();
    }

    public JobWorkdays update(JobWorkdays jobWorkdays){
        return jobWorkdaysRepository.save(jobWorkdays);
    }

    public void delete(Long idWorkdays) {
        jobWorkdaysRepository.deleteById(idWorkdays);
    }

}
