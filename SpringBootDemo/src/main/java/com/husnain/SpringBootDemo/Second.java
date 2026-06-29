package com.husnain.SpringBootDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Second {
    private String name;
    public Second( @Value("Husnain") String name) {
        this.name = name;
    }
    public void second() {
        System.out.println("second"+name);
    }
}
