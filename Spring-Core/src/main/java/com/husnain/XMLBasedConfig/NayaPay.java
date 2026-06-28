package com.husnain.XMLBasedConfig;

public class NayaPay implements PaymentMethod {
    @Override
    public void paymentMethod() {
        System.out.println("NayaPay payment " +
                "method");
    }
}
