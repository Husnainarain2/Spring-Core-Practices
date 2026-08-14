package com.example.dto.request;

import lombok.Data;

@Data
public class CourseRequestDto {
    private String name;
    private Long departmentId;
    private Long teacherId;
}
