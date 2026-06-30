package com.husnain.SpringBootDemo.paymentExmple;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner
/*
CommandLineRunner*/ {

    private final paymentGateway paymentGateway;

    public AppRunner(paymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGateway.printPaymentDetails();
    }
}
//    @Override
//    public void run(String... args) throws Exception {
//        paymentGateway.printPaymentDetails();
//    }
