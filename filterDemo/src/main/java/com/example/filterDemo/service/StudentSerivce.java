package com.example.filterDemo.service;

import com.example.filterDemo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentSerivce {

    public Student createStudent(Student student) {
            // Logic to create a student
        System.out.println("Student created successfully!");
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        return student;
    }
}
