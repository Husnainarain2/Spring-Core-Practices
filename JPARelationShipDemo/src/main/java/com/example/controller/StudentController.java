package com.example.controller;

import com.example.dto.request.StudentRequestDto;
import com.example.model.Student;
import com.example.service.StudentService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping()
    public ResponseEntity<String> addStudent(@RequestBody StudentRequestDto student) {
        studentService.addStudent(student);
        return ResponseEntity.ok("Student added successfully");
    }
}

