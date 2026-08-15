package com.example.dto.response;


import lombok.Data;

import java.util.List;

@Data
public class TeacherResponseDto {
    private Long id;
    private String name;

    private Long departmentId;
    private String departmentName;

    private List<CourseResponseDto> courses;

}
