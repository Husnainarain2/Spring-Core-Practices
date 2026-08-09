package com.example.service;

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
    public void save(Student student, Long deptId) {
        Department department =
                departmentRepository.findById(deptId);
        student.setDepartment(department);
        studentRepository.save(student);
    }
    @Transactional
    public Student getStudentById(Long id) {
        return studentRepository.findById(id);
    }
    @Transactional
    public Student updateStudent(long id, Student student){
        Student student1=studentRepository.findById(id);
        if (student1!=null){
            student1.setFirstName(student.getFirstName());
            student1.setLastName(student.getLastName());
            student1.setEmail(student.getEmail());
            student1.setAge(student.getAge());
            student1.setDepartment(student.getDepartment());
        }
        return student;
    }

}
