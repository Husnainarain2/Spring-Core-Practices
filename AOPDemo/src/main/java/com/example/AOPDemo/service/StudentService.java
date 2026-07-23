package com.example.AOPDemo.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String createStudent() {
        return "Student created successfully!";
    }
}
