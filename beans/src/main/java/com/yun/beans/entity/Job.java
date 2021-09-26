package com.yun.beans.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job")
@ApiModel(value = "Job对象", description = "工作详情信息")
public class Job implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "job_city")
    private String jobCity;

    @Column(name = "job_year")
    private String jobYear;

    @Column(name = "job_degree")
    private String jobDegree;

    @Column(name = "job_need_number")
    private Integer jobNeedNumber;

    @Column(name = "job_publish_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date jobPublishTime;

    @Column(name = "job_welfare")
    private String jobWelfare;

    @Column(name = "job_duty")
    private String jobDuty;

    @Column(name = "job_demand")
    private String jobDemand;

    @Column(name = "job_addr_detail")
    private String jobAddrDetail;

    @Column(name = "job_min_salary")
    private BigDecimal jobMinSalary;

    @Column(name = "job_max_salary")
    private BigDecimal jobMaxSalary;

    @Column(name = "job_search_keyword")
    private String jobSearchKeyword;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}