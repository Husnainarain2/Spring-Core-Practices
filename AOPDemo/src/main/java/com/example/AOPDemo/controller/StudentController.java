package com.example.AOPDemo.controller;

import com.example.AOPDemo.dto.studentDto;
import com.example.AOPDemo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Apo/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<studentDto> create(@RequestBody studentDto studentDto) {
        studentDto reply=
                studentService.createStudent(studentDto);
        return ResponseEntity.ok(reply);
    }
    @GetMapping
    public ResponseEntity<String> get() {
        String para = "All the students Data ";
        String result =
                studentService.getStudent(para);
        return ResponseEntity.ok(result);
    }
}
