package com.husnain;

import com.husnain.FirstWeek.AppConfig;
import com.husnain.FirstWeek.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to Spring Framework");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user=context.getBean(User.class);
        user.userMethod();
    }
}
