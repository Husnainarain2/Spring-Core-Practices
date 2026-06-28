package com.husnain.XMLBasedConfig;

public class Jazzcash implements PaymentMethod {
    @Override
    public void paymentMethod() {
        System.out.println("Jazzcash payment " +
                "method");
    }
}
