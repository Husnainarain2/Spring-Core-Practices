package com.husnain.SpringBootDemo.paymentExmple;

import org.springframework.stereotype.Component;

@Component
public class paymentGateway {

    private final PaymentDetails paymentDetails;

    public paymentGateway(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getType() {
        return paymentDetails.getType();
    }

    public int getCount() {
        return paymentDetails.getCount();
    }

    public int getAmount() {
        return paymentDetails.getAmount();

    }

    public int getTimeStamp() {
        return paymentDetails.getTimeStamp();
    }

    public String getCurrency() {
        return paymentDetails.getCurrency();
    }

    public void printPaymentDetails() {
        System.out.println("Payment Gateway Type: " + paymentDetails.getType());
        System.out.println("Payment Gateway Count: " + paymentDetails.getCount());
        System.out.println("Payment Gateway Amount: " + paymentDetails.getAmount());
        System.out.println("Payment Gateway Time Stamp: " + paymentDetails.getTimeStamp());
        System.out.println("Payment Gateway Currency: " + paymentDetails.getCurrency());
    }

}

/* -----------  @Value Method ----------*/


//    private String type;
//    private String count;
//
//    public paymentGateway(@Value("${paymentGateway.type}") String type,
//                          @Value("${paymentGateway.count}") String count) {
//        this.type = type;
//        this.count = count;
//    }
//
//
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//
//
//    public void setCount(String count) {
//        this.count = count;
//    }
