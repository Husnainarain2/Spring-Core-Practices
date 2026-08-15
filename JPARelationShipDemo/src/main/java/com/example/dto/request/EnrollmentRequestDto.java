package com.example.dto.request;

import lombok.Data;

@Data
public class EnrollmentRequestDto {


    private String semester;
    private String grade;
    private Long studentId;
    private Long courseId;
}
