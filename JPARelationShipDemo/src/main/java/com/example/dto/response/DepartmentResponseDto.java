package com.example.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class DepartmentResponseDto {
    private long id;
    private String name;

    private List<StudentResponseDto> students;
    private List<TeacherResponseDto> teachers;
    private List<CourseResponseDto> courses;
}
