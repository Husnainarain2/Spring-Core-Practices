package com.example.AOPDemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

    @Before("execution(String com.example.AOPDemo.service.StudentService.createStudent())")
    public void logCreateStudent() {
        System.out.println("Logging createStudent method call");
    }
}
