package com.example.AOPDemo.aspects;

import com.example.AOPDemo.dto.studentDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

//    @Before("execution(String com.example.AOPDemo.service.StudentService.createStudent())")
//    public void logCreateStudent(JoinPoint joinPoint) {
//        joinPoint.getArgs();
//        System.out.println("Logging createStudent method call");
//    }

    @AfterReturning("execution(* com" +
            ".example.AOPDemo" +
            ".service.StudentService" +
            ".createStudent(..))")
    public void logAfterReturnCreateStudent(studentDto studentDto) {
        studentDto.setAge(12);
        studentDto.setName("John Doe");
        System.out.println("Logging createStudent method call");
    }
}
