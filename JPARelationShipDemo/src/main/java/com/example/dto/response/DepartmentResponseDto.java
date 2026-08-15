package com.example.dto.response;

import lombok.*;

import java.util.List;

@Data
public class DepartmentResponseDto {
    private long id;
    private String name;
    private List<StudentSummaryDto> students;
    private List<TeacherSummaryDto> teachers;
    private List<CourseSummaryDto> courses;
}
