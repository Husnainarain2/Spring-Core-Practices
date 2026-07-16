package com.example.filterDemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class Student {

    @PostMapping("/create")
    public String createStudent() {

        return "Student created successfully!";
    }

}
