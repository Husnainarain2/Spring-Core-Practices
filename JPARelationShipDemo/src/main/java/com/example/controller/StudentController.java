package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/Students")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public ResponseEntity<String> createStudent(@RequestParam Long deptId, @RequestBody Student student) {
        studentService.save(student,deptId);
        return ResponseEntity.ok("Student created successfully");
    }
    @GetMapping()
    public ResponseEntity<Student> getAllStudents(@RequestParam Long Id) {
     Student result=
             studentService.getById(Id);
     return ResponseEntity.ok(result);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students=
                studentService.getAll();
        return ResponseEntity.ok(students);
    }

}
