package com.example.service;

import com.example.dto.request.CourseRequestDto;
import com.example.model.Course;
import com.example.model.Department;
import com.example.model.Teacher;
import com.example.repository.CourseRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final DepartmentRepository departmentRepository;
    private final TeacherRepository teacherRepository;

    public CourseService(CourseRepository courseRepository, DepartmentRepository departmentRepository, TeacherRepository teacherRepository) {
        this.courseRepository = courseRepository;
        this.departmentRepository = departmentRepository;
        this.teacherRepository = teacherRepository;
    }

    public void createCourse(CourseRequestDto courseRequestDto) {
        Department department =
                departmentRepository.findById(courseRequestDto.getDepartmentId()).orElseThrow(() -> new IllegalArgumentException("Department not found with id: " + courseRequestDto.getDepartmentId()));
        Teacher teacher = teacherRepository.findById(courseRequestDto.getTeacherId());
        Course course = new Course();
        course.setName(courseRequestDto.getName());
        course.setDepartment(department);
        course.setTeacher(teacher);
        courseRepository.save(course);

    }
}
