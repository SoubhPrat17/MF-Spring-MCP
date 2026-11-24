package com.example.fundquery.data.repository;

import com.example.fundquery.data.entity.MutualFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MutualFundRepository extends JpaRepository<MutualFund, String> {
/* The significance of <MutualFund, String>
    MutualFund: The entity this repository manages.
    String: The data type of its primary key (cl_plan_id). */

    List<MutualFund> findByClFundRating(String clFundRating);
    List<MutualFund> findByClCategory(String category);
//    This method name is understood by Spring Data JPA as a query to find record by cl_fund_rating
}