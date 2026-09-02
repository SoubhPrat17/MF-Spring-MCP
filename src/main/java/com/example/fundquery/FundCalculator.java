package com.example.fundquery;

import org.springframework.stereotype.Component;

@Component
public class FundCalculator {

//    public String Calculate(){
//        return "Calculation Complete";
//    }

    public double calculate(double initial, double current) {
        return ((current - initial) / initial) * 100;
    }
}
