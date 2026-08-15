package com.example.dto.response;

import lombok.Data;

import java.util.List;
@Data
public class CourseResponseDto {
    private Long id;
    private String name;

    private Long departmentId;
    private String departmentName;

    private Long teacherId;
    private String teacherName;

    private List<EnrollmentResponseDto> enrollments;
}
