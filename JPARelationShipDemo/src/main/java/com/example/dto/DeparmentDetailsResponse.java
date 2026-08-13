package com.example.dto;

import java.util.List;

public class DeparmentDetailsResponse {
    private long id;
    private String name;

    private List<StudentResponseDto> students;
    private List<TeacherResponseDto> teachers;
    private List<CourseResponseDto> courses;

    public DeparmentDetailsResponse(long id, String name, List<StudentResponseDto> students, List<TeacherResponseDto> teachers, List<CourseResponseDto> courses) {
        this.id = id;
        this.name = name;
        this.students = students;
        this.teachers = teachers;
        this.courses = courses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentResponseDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentResponseDto> students) {
        this.students = students;
    }

    public List<TeacherResponseDto> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherResponseDto> teachers) {
        this.teachers = teachers;
    }

    public List<CourseResponseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseResponseDto> courses) {
        this.courses = courses;
    }
}
