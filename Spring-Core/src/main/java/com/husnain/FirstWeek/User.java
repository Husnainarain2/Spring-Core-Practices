package com.husnain.FirstWeek;

import org.springframework.stereotype.Component;

@Component
public class User {
    private final  Manager manager;
    public User(Manager manager) {
        this.manager=manager;
        System.out.println("User Constructor");
    }
    public void userMethod(){
        System.out.println("User Method call " +
                "tha :");
        manager.managerMethod();
    }

    // i have two possible ways to create a
    // bean in spring framework one is by using @Component annotation and other is by using @Bean annotation in AppConfig class
}
