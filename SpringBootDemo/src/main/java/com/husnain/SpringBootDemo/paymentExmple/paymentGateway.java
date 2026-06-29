package com.husnain.SpringBootDemo.paymentExmple;

import org.springframework.stereotype.Component;

@Component
public class paymentGateway {
    private String type;
    private String count;

    public paymentGateway(String type, String count) {
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
