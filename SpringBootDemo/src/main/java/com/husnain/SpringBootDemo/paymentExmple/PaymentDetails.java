package com.husnain.SpringBootDemo.paymentExmple;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "payment")
public class PaymentDetails {
    private String type;
    private int count;
    private int amount;
    private int timeStamp;
    private String currency;

    public PaymentDetails(int count, String type, int amount, int timeStamp, String currency) {
        this.count = count;
        this.type = type;
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
