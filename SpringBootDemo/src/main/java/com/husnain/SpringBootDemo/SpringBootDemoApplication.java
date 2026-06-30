package com.husnain.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
/*@ConfigurationPropertiesScan()*/
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);


//        paymentGateway Gateway = context.getBean(paymentGateway.class);
//        Gateway.printPaymentDetails();
    }

}
