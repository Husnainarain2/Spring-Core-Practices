package com.example.Mapper;

import com.example.dto.response.*;
import com.example.model.*;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class EntityMapper {

    // Department Mappper;
    public DepartmentResponseDto toDepartmentResponseDto(Department department) {
        DepartmentResponseDto departmentResponseDto = new DepartmentResponseDto();
        departmentResponseDto.setId(department.getId());
        departmentResponseDto.setName(department.getName());
        departmentResponseDto.setStudents(department.getStudents() == null ? Collections.emptyList() : department.getStudents().stream().map(this::toStudentResponseDto).toList());
        departmentResponseDto.setTeachers(department.getTeachers().stream().map(this::toTeacherResponseDto).toList());
        departmentResponseDto.setCourses(department.getCourses().stream().map(this::toCourseResponseDto).toList());
        return departmentResponseDto;
    }

    public StudentResponseDto toStudentResponseDto(Student student) {
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(student.getId());
        studentResponseDto.setName(student.getName());
        studentResponseDto.setEmail(student.getEmail());
        if (student.getDepartment() != null) {
            studentResponseDto.setDepartmentId(student.getDepartment().getId());
            studentResponseDto.setDepartmentName(student.getDepartment().getName());
        }
        studentResponseDto.setEnrollments(student.getEnrollments() == null ? Collections.emptyList() : student.getEnrollments().stream().map(this::toEnrollmentResponseDto).toList());
        return studentResponseDto;
    }

    public TeacherResponseDto toTeacherResponseDto(Teacher teacher) {
        TeacherResponseDto teacherResponseDto = new TeacherResponseDto();
        teacherResponseDto.setId(teacher.getId());
        teacherResponseDto.setName(teacher.getName());
        if (teacher.getDepartment() != null) {
            teacherResponseDto.setDepartmentId(teacher.getDepartment().getId());
            teacherResponseDto.setDepartmentName(teacher.getDepartment().getName());
        }
        teacherResponseDto.setCourses(teacher.getCourses() == null ? Collections.emptyList() : teacher.getCourses().stream().map(this::toCourseResponseDto).toList());
        return teacherResponseDto;
    }

    public CourseResponseDto toCourseResponseDto(Course course) {
        CourseResponseDto courseResponseDto = new CourseResponseDto();
        courseResponseDto.setId(course.getId());
        courseResponseDto.setName(course.getName());
        if (course.getDepartment() != null) {
            courseResponseDto.setDepartmentId(course.getDepartment().getId());
            courseResponseDto.setDepartmentName(course.getDepartment().getName());
        }
        if (course.getTeacher() != null) {
            courseResponseDto.setTeacherId(course.getTeacher().getId());
            courseResponseDto.setTeacherName(course.getTeacher().getName());
        }
        courseResponseDto.setEnrollments(course.getEnrollments() == null ? Collections.emptyList() : course.getEnrollments().stream().map(this::toEnrollmentResponseDto).toList());
        return courseResponseDto;
    }

    public EnrollmentResponseDto toEnrollmentResponseDto(Enrollment enrollment) {
        EnrollmentResponseDto enrollmentResponseDto = new EnrollmentResponseDto();
        enrollmentResponseDto.setId(enrollment.getId());
        enrollmentResponseDto.setGrade(enrollment.getGrade());
        enrollmentResponseDto.setSemester(enrollment.getSemster());
        if (enrollment.getStudent() != null) {
            enrollmentResponseDto.setStudentId(enrollment.getStudent().getId());
            enrollmentResponseDto.setStudentName(enrollment.getStudent().getName());
        }
        if (enrollment.getCourse() != null) {
            enrollmentResponseDto.setCourseId(enrollment.getCourse().getId());
            enrollmentResponseDto.setCourseName(enrollment.getCourse().getName());
        }
        return enrollmentResponseDto;
    }
}

