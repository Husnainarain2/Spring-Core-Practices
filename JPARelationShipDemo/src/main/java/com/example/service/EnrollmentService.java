package com.example.service;

import com.example.dto.request.EnrollmentRequestDto;
import com.example.model.Course;
import com.example.model.Enrollment;
import com.example.model.Student;
import com.example.repository.CourseRepository;
import com.example.repository.EnrollmentRepository;
import com.example.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository, StudentRepository studentRepository, CourseRepository courseRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }
    @Transactional
    public void enrollStudent(EnrollmentRequestDto enrollmentRequestDto) {
        Student student =
                studentRepository.findById(enrollmentRequestDto.getStudentId());
        Optional<Course> course = courseRepository.findById(enrollmentRequestDto.getCourseId());
        if (student != null && course.isPresent()) {
            Enrollment enrollment = new Enrollment();
            enrollment.setStudent(student);
            enrollment.setCourse(course.get());
            enrollment.setSemster(enrollmentRequestDto.getSemester());
            enrollment.setGrade(enrollmentRequestDto.getGrade());
            enrollmentRepository.save(enrollment);
        } else {
            throw new IllegalArgumentException("Invalid student or course ID");
        }

    }
}
