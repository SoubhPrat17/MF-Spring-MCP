package com.example.fundquery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundController {

    private final FundService fundService;
    public FundController(FundService fundService) {
        this.fundService = fundService;
    }

    @GetMapping("/funds")
    public double getFunds() {
        return fundService.getFunds();
    }

    @GetMapping("/funds/return")
    public double getReturn(@RequestParam double initial, @RequestParam double current) {
        return fundService.getReturn(initial,current);
    }

    @GetMapping("/funds/return/message")
    public String getReturnMessage(@RequestParam double initial, @RequestParam double current) {
        String str = "Fund return: "+fundService.getReturn(initial,current)+"%";
        return str;
    }
}
