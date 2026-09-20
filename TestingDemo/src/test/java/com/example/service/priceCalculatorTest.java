package com.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class priceCalculatorTest {
    private priceCalculator priceCalculator;
    @BeforeEach
    public void setup() {
        priceCalculator = new priceCalculator();
    }
    @Test
     void shouldCalculatePrice() {
        double price = 1000;
        double discount = 20;
        double finalPrice = priceCalculator.calculatePrice(price, discount);
        assertEquals(800, finalPrice);
    }
}
