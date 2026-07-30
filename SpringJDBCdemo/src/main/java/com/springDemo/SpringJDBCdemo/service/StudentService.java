package com.springDemo.SpringJDBCdemo.service;

import com.springDemo.SpringJDBCdemo.model.Student;
import com.springDemo.SpringJDBCdemo.repositry.StudentRepositry;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepositry studentRepositry;
    public StudentService(StudentRepositry studentRepositry) {
        this.studentRepositry = studentRepositry;
    }
    public String createStudent(Student student) {
        studentRepositry.save(student);
        return "Student Created";
    }
}
