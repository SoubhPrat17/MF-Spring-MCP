package com.example.fundquery.api;

import com.example.fundquery.data.entity.MutualFund;
import com.example.fundquery.service.MutualFundService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MutualFundController {
    private final MutualFundService mutualFundService;

    public MutualFundController(MutualFundService mutualFundService) {
        this.mutualFundService = mutualFundService;
    }

    @GetMapping("/funds")
    public List<MutualFund> getAllFunds(){
        return mutualFundService.getAllFunds();
    }

    @GetMapping("/funds/rating/{rating}")
    public List<MutualFund> getFundsByRating( @PathVariable String rating){
        return mutualFundService.getFundsByClRating(rating);
    }

}
