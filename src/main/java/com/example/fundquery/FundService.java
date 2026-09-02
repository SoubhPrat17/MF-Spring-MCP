package com.example.fundquery;

import org.springframework.stereotype.Service;

@Service
public class FundService {

    private final FundCalculator calculator;
    public FundService (FundCalculator calculator){
        this.calculator=calculator;
    }

    public double getFunds() {
        return calculator.calculate(100,125);
    }

}
