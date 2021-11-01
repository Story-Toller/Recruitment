package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverJobVo {
    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "delivery_time")
    private String deliveryTime;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_logo")
    private String companyLogo;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "job_city")
    private String jobCity;

    @Column(name = "job_publish_time")
    private Date jobPublishTime;

    @Column(name = "job_min_salary")
    private BigDecimal jobMinSalary;

    @Column(name = "job_max_salary")
    private BigDecimal jobMaxSalary;

    @Column(name = "job_other1")
    private String jobOther1;

}
