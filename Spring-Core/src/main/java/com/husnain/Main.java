package com.husnain;

import com.husnain.FirstWeek.AppConfig;
import com.husnain.FirstWeek.User;
import com.husnain.FirstWeek.callbackMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to Spring Framework");
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user=context.getBean(User.class);
        user.userMethod();
        callbackMethod callbackMwthod= context.getBean(callbackMethod.class);
        System.out.println(callbackMwthod.getValueInMap(2));

        context.close();
    }
}
