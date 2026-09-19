package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class priceCalculator {

    public double calculatePrice(double price,double discount) {
        if (discount < 0) {
            throw new IllegalArgumentException("discount cannot be negative");
        }
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
        double finalPrice = price-((price*discount)/100);
        return finalPrice;
    }
}
