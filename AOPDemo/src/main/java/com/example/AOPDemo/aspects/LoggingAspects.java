package com.example.AOPDemo.aspects;

import com.example.AOPDemo.dto.studentDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

//    @Before("execution(String com.example.AOPDemo.service.StudentService.createStudent())")
//    public void logCreateStudent(JoinPoint joinPoint) {
//        joinPoint.getArgs();
//        System.out.println("Logging createStudent method call");
//    }

//    @AfterReturning("execution(* com" +
//            ".example.AOPDemo" +
//            ".service.StudentService" +
//            ".createStudent(..))")
//    public void logAfterReturnCreateStudent(studentDto studentDto) {
//        studentDto.setAge(12);
//        studentDto.setName("John Doe");
//        System.out.println("Logging createStudent method call");
//    }

//    @AfterThrowing(value = "execution(* com" +
//            ".example.AOPDemo" +
//            ".service.StudentService" +
//            ".createStudent(..))",
//    throwing = "ex")
//    public void logAfterThrowingCreateStudent(Exception ex) {
//        System.out.println("Logging exception in createStudent method: " + ex.getMessage());
//    }


//    @Around("execution(* com.example.AOPDemo.service.StudentService.createStudent(..))")
//    public Object logAroundCreateStudent(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        long startTime = System.currentTimeMillis();
//
//        System.out.println("Before createStudent");
//
//        Object[] args = joinPoint.getArgs();
//
//        studentDto dto = (studentDto) args[0];
//
//        dto.setAge(12);
//        dto.setName("John Doe");
//
//        Object result = joinPoint.proceed(args);
//
//        System.out.println("After createStudent");
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("Execution Time : " + (endTime - startTime) + " ms");
//
//        return result;
//    }

//    @Before("execution(String com" +
//            ".example" +
//            ".AOPDemo.service.StudentService" +
//            ".getStudent(String))")
//    public void logGet() {
//        System.out.println("Logging get method call");
//    }

    @Before("execution(* com.example.AOPDemo." +
            ".get*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Logging before method call: " + joinPoint.getSignature().getName());
    }
}

