package com.example.fundquery.data.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="mutual_fund_data",schema="public")
public class MutualFund {

    public MutualFund(){
    }

    @Id
    @Column(name="cl_plan_id")
    private String clPlanId;

    @Column(name = "fund_name")
    private String fundName;

    @Column(name = "scheme")
    private String scheme;

    @Column(name = "plan_name")
    private String planName;

    @Column(name = "cl_aum")
    private BigDecimal clAum;

    @Column(name = "cl_nav")
    private BigDecimal clNav;

    @Column(name="alpha")
    private BigDecimal alpha;

    @Column(name="beta")
    private BigDecimal beta;

    @Column(name="sharpe")
    private BigDecimal sharpe;

    @Column(name="cl_sortino_ratio")
    private BigDecimal clSortinoRatio;

    @Column(name="minimum_investment")
    private Integer minimumInvestment;

    @Column(name="cl_fund_rating")
    private String clFundRating;

    @Column(name="cl_isin_code")
    private String clIsinCode;

    @Column(name="cl_frequency")
    private String clFrequency;

    @Column(name="exit_load")
    private String exitLoad;

    @Column(name="rl_cl_ret_1year")
    private BigDecimal rlClRet1Year;

    @Column(name="rl_cl_ret_2year")
    private BigDecimal rlClRet2Year;

    @Column(name="rl_cl_ret_3year")
    private BigDecimal rlClRet3Year;

    @Column(name="rl_cl_ret_4year")
    private BigDecimal rlClRet4Year;

    @Column(name="rl_cl_ret_5year")
    private BigDecimal rlClRet5Year;

    @Column(name="rt_rolling1year")
    private BigDecimal rtRolling1Year;

    @Column(name="rt_rolling2year")
    private BigDecimal rtRolling2Year;

    @Column(name="rt_rolling3year")
    private BigDecimal rtRolling3Year;

    @Column(name="cl_average_maturity_period")
    private BigDecimal clAverageMaturityPeriod;

    @Column(name="cl_avg_ytm")
    private BigDecimal clAvgYtm;

    @Column(name = "cl_duration")
    private BigDecimal clDuration;

    @Column(name="cl_annualised_ytm")
    private BigDecimal clAnnualisedYtm;

    @Column(name="cl_category_name")
    private String clCategoryName;

    @Column(name="cl_rank")
    private String clRank;

    @Column(name="cl_pe")
    private BigDecimal clPe;

    @Column(name="cl_pb")
    private BigDecimal clPb;

    @Column(name="cl_large_percentage")
    private BigDecimal clLargePercentage;

    @Column(name="cl_mid_percentage")
    private BigDecimal clMidPercentage;

    @Column(name="cl_small_percentage")
    private BigDecimal clSmallPercentage;

    @Column(name="cl_low_52_week")
    private BigDecimal clLow52Week;

    public String getClPlanId() {
        return clPlanId;
    }

    public String getScheme() {
        return scheme;
    }

    public String getPlanName() {
        return planName;
    }

    public BigDecimal getClAum() {
        return clAum;
    }

    public BigDecimal getClNav() {
        return clNav;
    }

    public BigDecimal getAlpha() {
        return alpha;
    }

    public BigDecimal getSharpe() {
        return sharpe;
    }

    public BigDecimal getBeta() {
        return beta;
    }

    public BigDecimal getClSortinoRatio() {
        return clSortinoRatio;
    }

    public Integer getMinimumInvestment() {
        return minimumInvestment;
    }

    public String getClFundRating() {
        return clFundRating;
    }

    public String getClIsinCode() {
        return clIsinCode;
    }

    public String getClFrequency() {
        return clFrequency;
    }

    public String getExitLoad() {
        return exitLoad;
    }

    public BigDecimal getRlClRet1Year() {
        return rlClRet1Year;
    }

    public BigDecimal getRlClRet2Year() {
        return rlClRet2Year;
    }

    public BigDecimal getRlClRet3Year() {
        return rlClRet3Year;
    }

    public BigDecimal getRlClRet4Year() {
        return rlClRet4Year;
    }

    public BigDecimal getRtRolling1Year() {
        return rtRolling1Year;
    }

    public BigDecimal getRlClRet5Year() {
        return rlClRet5Year;
    }

    public BigDecimal getRtRolling2Year() {
        return rtRolling2Year;
    }

    public BigDecimal getRtRolling3Year() {
        return rtRolling3Year;
    }

    public BigDecimal getClAverageMaturityPeriod() {
        return clAverageMaturityPeriod;
    }

    public BigDecimal getClAvgYtm() {
        return clAvgYtm;
    }

    public BigDecimal getClDuration() {
        return clDuration;
    }

    public BigDecimal getClAnnualisedYtm() {
        return clAnnualisedYtm;
    }

    public String getClCategoryName() {
        return clCategoryName;
    }

    public String getClRank() {
        return clRank;
    }

    public BigDecimal getClPe() {
        return clPe;
    }

    public BigDecimal getClPb() {
        return clPb;
    }

    public BigDecimal getClLargePercentage() {
        return clLargePercentage;
    }

    public BigDecimal getClMidPercentage() {
        return clMidPercentage;
    }

    public BigDecimal getClSmallPercentage() {
        return clSmallPercentage;
    }

    public BigDecimal getClLow52Week() {
        return clLow52Week;
    }

    public BigDecimal getClHigh52Week() {
        return clHigh52Week;
    }

    @Column(name="cl_high_52_week")
    private BigDecimal clHigh52Week;

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
}
