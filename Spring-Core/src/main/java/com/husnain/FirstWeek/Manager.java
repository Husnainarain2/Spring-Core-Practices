package com.husnain.FirstWeek;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Manager {
    public Manager() {
        System.out.println("Manager Constructor");
    }
     public void managerMethod(){
        System.out.print("Manager Method");
     }
}
