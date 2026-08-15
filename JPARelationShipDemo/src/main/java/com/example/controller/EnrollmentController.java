package com.example.controller;

import com.example.dto.request.EnrollmentRequestDto;
import com.example.service.EnrollmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public String enrollStudent(@RequestBody EnrollmentRequestDto enrollmentRequestDto) {
        enrollmentService.enrollStudent(enrollmentRequestDto);
        return "Student enrolled successfully!";
    }

}
