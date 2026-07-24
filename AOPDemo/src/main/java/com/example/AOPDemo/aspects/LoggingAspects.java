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


    @Around("execution(* com.example.AOPDemo.service.StudentService.createStudent(..))")
    public studentDto logAroundCreateStudent(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Logging around createStudent method call");
//        Object result = joinPoint.proceed();

//         studentDto studentDto=(studentDto)joinPoint.proceed();
       Object[] args = joinPoint.getArgs();
        studentDto studentDto =
                (studentDto) args[0];
        studentDto.setAge(12);
        studentDto.setName("John Doe");
        System.out.println("Logging around createStudent method call - after execution");
        return studentDto;
    }

}

