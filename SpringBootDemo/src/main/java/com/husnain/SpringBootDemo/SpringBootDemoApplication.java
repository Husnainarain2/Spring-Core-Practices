package com.husnain.SpringBootDemo;

import com.husnain.SpringBootDemo.paymentExmple.paymentGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
/*@ConfigurationPropertiesScan()*/
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//        First first= context.getBean(First.class);
//        first.first();
//        AppRunner runner= context.getBean(AppRunner.class);
        paymentGateway Gateway = context.getBean(paymentGateway.class);
        Gateway.printPaymentDetails();
    }

}
