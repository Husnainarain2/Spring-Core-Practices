package com.example.service;

import com.example.model.Department;
import com.example.model.Student;
import com.example.repository.DepartmentRepository;
import com.example.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;
    private StudentRepository studentRepository;
    public DepartmentService(DepartmentRepository departmentRepository, StudentRepository studentRepository) {
        this.departmentRepository = departmentRepository;
        this.studentRepository = studentRepository;
    }
    @Transactional
    public void createDepartment(Department department) {
        departmentRepository.save(department);
    }
    @Transactional
    public void createDepartmentWithStudent(Department department, String studentName) {
        Student student = new Student();
        student.setDepartment(department);
        student.setFirstName(studentName);

        department.getStudents().add(student);
        studentRepository.save(student);
        departmentRepository.save(department);
    }
}


