package com.springDemo.SpringJDBCdemo.controller;

import com.springDemo.SpringJDBCdemo.model.Student;
import com.springDemo.SpringJDBCdemo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public ResponseEntity<String> createStudent(Student student) {
        String result = studentService.createStudent(student);
        // For now, we will just return a success message
        return ResponseEntity.ok(result);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<String> getStudentById(@PathVariable Long id) {

        return ResponseEntity.ok("Student found successfully");
    }

    @GetMapping
    public ResponseEntity<String> getStudents() {
        return ResponseEntity.ok("Student found successfully");
    }
}
