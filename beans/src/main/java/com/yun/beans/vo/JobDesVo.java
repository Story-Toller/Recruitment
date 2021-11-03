package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDesVo {
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
     * 公司员工规模
     */
    @Column(name = "company_emp_count")
    private String companyEmpCount;

    /**
     * 公司所属行业
     */
    @Column(name = "company_industury")
    private String companyIndustury;

    /**
     * 公司简介
     */
    @Column(name = "company_desc")
    private String companyDesc;

    /**
     * 公司管理员账户名
     */
    @Column(name = "company_admin_name")
    private String companyAdminName;

    /**
     * 公司管理员账户手机
     */
    @Column(name = "company_admin_telno")
    private Long companyAdminTelno;

    /**
     * 公司管理员账户邮箱
     */
    @Column(name = "company_admin_email")
    private String companyAdminEmail;

    @Column(name = "company_admin_position")
    private String companyAdminPosition;

    @Column(name = "company_admin_img")
    private String companyAdminImg;
}
