package com.example.controller;

import com.example.dto.request.CourseRequestDto;
import com.example.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @PostMapping
    public ResponseEntity<String> createCourse(@RequestBody CourseRequestDto courseRequestDto) {
         courseService.createCourse(courseRequestDto);
        return ResponseEntity.ok("Course created successfully");
    }
}
