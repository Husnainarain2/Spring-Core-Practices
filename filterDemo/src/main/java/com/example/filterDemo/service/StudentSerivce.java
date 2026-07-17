package com.example.filterDemo.service;

import org.springframework.stereotype.Service;

@Service
public class StudentSerivce {

    public String createStudent() {
            // Logic to create a student

        return "Student  service created " +
                "successfully";
    }
}
