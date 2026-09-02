package com.example.fundquery;

import org.springframework.stereotype.Component;

@Component
public class FundCalculator {

//    public String Calculate(){
//        return "Calculation Complete";
//    }

    public double calculate(double initialValue, double finalValue) {
        return ((finalValue - initialValue) / initialValue) * 100;
    }
}
