package com.husnain.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class First {
    private Second  second;
    public First(Second second) {
        this.second = second;
    }
    public void first() {
        System.out.println("first");
        second.second();

    }
}
