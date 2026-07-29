package com.example.AOPDemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectsReuse {

    @Pointcut("within(com.example.AOPDemo.service." +
            ".*) && execution(* com.example" +
            ".AOPDemo.service..get*(..))")
    public void TwoAspects(){
        // empty body
    }

    @Pointcut("@annotation" +
            "(TimeExecutionAnnotation)")
    public void TimeExecutionAnnotation(){

    }

}
