package com.example.fundquery.api;

import com.example.fundquery.data.entity.MutualFund;
import com.example.fundquery.service.MutualFundService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/funds")
public class MutualFundController {
    private final MutualFundService mutualFundService;

    public MutualFundController(MutualFundService mutualFundService) {
        this.mutualFundService = mutualFundService;
    }

    @GetMapping
    public List<MutualFund> getAllFunds(){
        return mutualFundService.getAllFunds();
    }

    @GetMapping("/rating/{rating}")
    public List<MutualFund> getFundsByRating( @PathVariable String rating){
        return mutualFundService.getFundsByClRating(rating);
    }

    @GetMapping("/category/{category}")
    public List<MutualFund> getFundsByCategory(@PathVariable String category){
        return mutualFundService.getFundsByClCategory(category);
    }

    @GetMapping("/category/rating={rating}&category={category")
    public List<MutualFund> getFundsByMultipleCriteria(@PathVariable String rating, @PathVariable String category){
        return mutualFundService.getFundsByMultipleCriteria(rating, category);
    }

}
