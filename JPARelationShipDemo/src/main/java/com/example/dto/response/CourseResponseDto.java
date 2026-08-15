package com.example.dto.response;

import java.util.List;

public class CourseResponseDto {
    private Long id;
    private String name;

    private Long departmentId;
    private String departmentName;

    private Long teacherId;
    private String teacherName;

    private List<EnrollmentResponseDto> enrollments;
}
