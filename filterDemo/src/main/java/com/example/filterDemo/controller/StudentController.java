package com.example.filterDemo.controller;

import com.example.filterDemo.entity.Student;
import com.example.filterDemo.service.StudentSerivce;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentSerivce studentSerivce;

    public StudentController(StudentSerivce studentSerivce) {
        this.studentSerivce = studentSerivce;
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        studentSerivce.createStudent(student);
        return ResponseEntity.ok("Student created successfully!");
    }

}

