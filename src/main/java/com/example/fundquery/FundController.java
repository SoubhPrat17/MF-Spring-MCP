package com.example.fundquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundController {
    @Autowired

    private final FundService fundService;
    public FundController(FundService fundService) {
        this.fundService = fundService;
    }

    @GetMapping("/funds")
    public double getFunds() {
        return fundService.getFunds();
    }
}
