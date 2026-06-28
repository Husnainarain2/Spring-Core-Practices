package com.husnain.XMLBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//        OrderService orderService = (OrderService) context.getBean("orderService");
//        OrderService orderService2= context.getBean(OrderService.class);
        OrderService orderService3=context.getBean("orderService", OrderService.class);
        orderService3.placeOrder();

    }
}
