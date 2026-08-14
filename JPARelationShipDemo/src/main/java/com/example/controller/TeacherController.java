package com.example.controller;

import com.example.dto.request.TeacherRequestDto;
import com.example.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public ResponseEntity<String> createTeacher(@RequestBody TeacherRequestDto teacherRequestDto) {
        teacherService.createTeacher(teacherRequestDto);
        return ResponseEntity.ok("Teacher created successfully");
    }
}
