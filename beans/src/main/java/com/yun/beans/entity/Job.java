package com.yun.beans.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    /**
     * id
     */
    @Id
    @Column(name = "job_id")
    private Integer jobId;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 职位发布人id
     */
    @Column(name = "company_admin_id")
    private Integer companyAdminId;

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
     * 学历要求
     */
    @Column(name = "job_degree")
    private String jobDegree;

    /**
     * 招聘人数
     */
    @Column(name = "job_need_number")
    private Integer jobNeedNumber;

    /**
     * 发布时间
     */
    @Column(name = "job_publish_time")
    private String jobPublishTime;

    /**
     * 福利
     */
    @Column(name = "job_welfare")
    private String jobWelfare;

    /**
     * 职位职责
     */
    @Column(name = "job_duty")
    private String jobDuty;

    /**
     * 职位要求
     */
    @Column(name = "job_demand")
    private String jobDemand;

    /**
     * 职位具体地点
     */
    @Column(name = "job_addr_detail")
    private String jobAddrDetail;

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
     * 搜索关键字
     */
    @Column(name = "job_search_keyword")
    private String jobSearchKeyword;

    /**
     * 状态
     */
    @Column(name = "job_status")
    private Integer jobStatus;

    /**
     * 状态
     *  全职
     *  兼职
     */
    @Column(name = "job_other1")
    private String jobOther1;

    /**
     * 职位类别
     */
    @Column(name = "job_other2")
    private String jobOther2;
}