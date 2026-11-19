package com.example.fundquery.data.repository;

import com.example.fundquery.data.entity.MutualFund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MutualFundRepository extends JpaRepository<MutualFund, String> {
/* The significance of <MutualFund, String>
    MutualFund: The entity this repository manages.
    String: The data type of its primary key (cl_plan_id). */



}