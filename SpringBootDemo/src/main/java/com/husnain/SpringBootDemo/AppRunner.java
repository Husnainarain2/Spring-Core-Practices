package com.husnain.SpringBootDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private First first;
    public AppRunner(First first) {
        System.out.println("AppRunner instance created.");
        this.first = first;
    }
    @Override
    public void run(String... args) throws Exception {
        first.first();
    }
}
