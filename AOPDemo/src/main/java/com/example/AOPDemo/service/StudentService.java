package com.example.AOPDemo.service;

import com.example.AOPDemo.annotations.TimeExecutionAnnotation;
import com.example.AOPDemo.dto.studentDto;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    public studentDto createStudent(studentDto studentDto) {
        studentDto.setName(studentDto.getName());

        studentDto.setAge(studentDto.getAge());

        System.out.println("Creating student: " + studentDto.getName());
        return studentDto;
    }
    @TimeExecutionAnnotation
    public String getStudent(String p) {

        try{
            Thread.sleep(2000);
        }
        catch(Exception e) {
        }

        System.out.println("Getting student");
        return p;
    }

}
