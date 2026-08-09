package com.example.service;

import com.example.model.Department;
import com.example.model.Student;
import com.example.repository.DepartmentRepository;
import com.example.repository.StudentRepository;
import com.example.repository.StudentjpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    private DepartmentRepository departmentRepository;
    private StudentjpaRepository studentjpaRepository;
    public StudentService(StudentRepository studentRepository, DepartmentRepository departmentRepository, StudentjpaRepository studentjpaRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
        this.studentjpaRepository = studentjpaRepository;
    }
    @Transactional
    public void save(Student student, Long deptId) {
        Department department =
                departmentRepository.findById(deptId);
        student.setDepartment(department);
        studentRepository.save(student);
        // Implementation for saving student with department ID
    }
    @Transactional
    public Student getById(Long Id) {
         Student result=
                 studentRepository.getById(Id);
        return result;
    }

    public List<Student> getAll(){

      return   studentjpaRepository.findAll();
    }
}
