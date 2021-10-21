package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobCollectionVo {

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "job_id")
    private Integer jobId;

    /**
     * 职位名称
     */
    @Column(name = "job_name")
    private String jobName;

    /**
     * 职位工作城市
     */
    @Column(name = "job_city")
    private String jobCity;

    /**
     * 工作年限
     */
    @Column(name = "job_year")
    private String jobYear;


    /**
     * 最低薪资
     */
    @Column(name = "job_min_salary")
    private BigDecimal jobMinSalary;

    /**
     * 最高薪资
     */
    @Column(name = "job_max_salary")
    private BigDecimal jobMaxSalary;


    /**
     * 状态
     * 全职
     * 兼职
     */
    @Column(name = "job_other1")
    private String jobOther1;

    /**
     * 公司名
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司logo
     */
    @Column(name = "company_logo")
    private String companyLogo;

    /**
     * 收藏时间
     */
    @Column(name = "collection_time")
    private String collectionTime;

    /**
     * 收藏id
     */
    @Id
    @Column(name = "collection_id")
    private Integer collectionId;
}
