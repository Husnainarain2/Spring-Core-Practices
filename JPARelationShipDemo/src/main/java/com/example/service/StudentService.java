package com.example.service;

import com.example.dto.request.StudentRequestDto;
import com.example.model.Department;
import com.example.model.Student;
import com.example.repository.DepartmentRepository;
import com.example.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    private DepartmentRepository departmentRepository;

    public StudentService(StudentRepository studentRepository, DepartmentRepository departmentRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
    }

    @Transactional
    public void addStudent(StudentRequestDto student) {
        Department department =
                departmentRepository.findById(student.getDepartmentId()).orElseThrow(() -> new IllegalArgumentException("Department not found with id: " + student.getDepartmentId()));
        Student student1= new Student();
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setDepartment(department);
        studentRepository.save(student1);
    }
}
