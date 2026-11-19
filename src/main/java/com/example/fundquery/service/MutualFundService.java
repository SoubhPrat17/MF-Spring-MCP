package com.example.fundquery.service;

import com.example.fundquery.data.entity.MutualFund;
import com.example.fundquery.data.repository.MutualFundRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MutualFundService {
//    Dependency declaration
    private final MutualFundRepository mutualFundRepository;

//    Constructor Injection
    public MutualFundService(MutualFundRepository mutualFundRepository) {
        this.mutualFundRepository = mutualFundRepository;
    }

    public List<MutualFund> getAllFunds(){
        List<MutualFund> allFunds= mutualFundRepository.findAll();
        return allFunds;
    }

    public List<MutualFund> getFundsByClRating(String clFundRating){
        List<MutualFund> fundsByClRating=mutualFundRepository.findByClFundRating(clFundRating);
        return fundsByClRating;
    }

}
