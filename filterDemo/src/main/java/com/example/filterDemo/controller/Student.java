package com.example.filterDemo.controller;

import com.example.filterDemo.service.StudentSerivce;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class Student {
    private final StudentSerivce studentSerivce;

    public Student(StudentSerivce studentSerivce) {
        this.studentSerivce = studentSerivce;
    }

    @PostMapping
    public ResponseEntity<String> createStudent() {
         studentSerivce.createStudent();
        return ResponseEntity.ok("Student created successfully!");
    }

}

