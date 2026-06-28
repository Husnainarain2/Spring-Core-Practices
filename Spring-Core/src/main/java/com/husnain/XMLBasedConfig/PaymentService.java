package com.husnain.XMLBasedConfig;

public class PaymentService {
   private String type;
    public PaymentService(String type) {
        this.type = type;
    }

//    private PaymentService() {
//        System.out.println("PaymentService instance created.");
//    }
    public void processPayment() {
        System.out.println(type+"Payment " +
                "processed" +
                " successfully!");
    }
}
