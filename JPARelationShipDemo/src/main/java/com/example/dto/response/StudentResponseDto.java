package com.example.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class StudentResponseDto {
    private Long id;
    private String name;
    private Long departmentId;
    private String departmentName;

    private List<EnrollmentResponseDto> enrollments;
}

