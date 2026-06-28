package com.husnain.XMLBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("AppConfig.xml");
//        OrderService orderService = (OrderService) context.getBean("orderService");
//        OrderService orderService2= context.getBean(OrderService.class);
//        OrderService orderService3=context.getBean("orderService", OrderService.class);
//        orderService3.placeOrder();
        OrderService orderService = (OrderService) context.getBean("orderService");
        orderService.placeOrder();

        beanLIfeCycle lifeCycle =
                context.getBean("beanLifeCycle"
                        ,beanLIfeCycle.class);
        lifeCycle.check();

//        ClassPathXmlApplicationContext context1
//                =
//                new ClassPathXmlApplicationContext("CollectionInjected.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.printUsers();

        context.close();

    }
}
