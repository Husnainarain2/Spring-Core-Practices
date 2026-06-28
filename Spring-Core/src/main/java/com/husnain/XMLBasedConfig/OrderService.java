package com.husnain.XMLBasedConfig;

public class OrderService {
    private PaymentService paymentService;
//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//        System.out.println("OrderService instance created.");
//    }


    public void setPaymentService(PaymentService paymentService) {
        System.out.println("paymentService set");
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        paymentService.processPayment();
    }
}
