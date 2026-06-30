package com.husnain.SpringBootDemo.paymentExmple;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final paymentGateway paymentGateway;

    public AppRunner(paymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void run(String... args) throws Exception {
        paymentGateway.printPaymentDetails();
    }
}
