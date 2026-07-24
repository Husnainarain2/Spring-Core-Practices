package com.example.AOPDemo.service;

import com.example.AOPDemo.dto.studentDto;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public studentDto createStudent(studentDto studentDto) {
        studentDto.setName(studentDto.getName());
        studentDto.setAge(studentDto.getAge());
        return studentDto;
    }
}
