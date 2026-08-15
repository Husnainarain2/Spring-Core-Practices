package com.example.dto.response;

import lombok.Data;

@Data
public class EnrollmentResponseDto {
    private Long id;
    private String semester;
    private String grade;

    private Long studentId;
    private String studentName;

    private Long courseId;
    private String courseName;
}
