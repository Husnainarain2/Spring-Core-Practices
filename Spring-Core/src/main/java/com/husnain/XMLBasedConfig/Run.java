package com.husnain.XMLBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
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

        context.close();

    }
}
