package com.yun.beans.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

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
    private Date jobPublishTime;

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
    private Integer status;

    private String other1;

    private String other2;

    /**
     * 获取id
     *
     * @return job_id - id
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * 设置id
     *
     * @param jobId id
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取公司id
     *
     * @return company_id - 公司id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司id
     *
     * @param companyId 公司id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取职位名称
     *
     * @return job_name - 职位名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置职位名称
     *
     * @param jobName 职位名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取职位工作城市
     *
     * @return job_city - 职位工作城市
     */
    public String getJobCity() {
        return jobCity;
    }

    /**
     * 设置职位工作城市
     *
     * @param jobCity 职位工作城市
     */
    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    /**
     * 获取工作年限
     *
     * @return job_year - 工作年限
     */
    public String getJobYear() {
        return jobYear;
    }

    /**
     * 设置工作年限
     *
     * @param jobYear 工作年限
     */
    public void setJobYear(String jobYear) {
        this.jobYear = jobYear;
    }

    /**
     * 获取学历要求
     *
     * @return job_degree - 学历要求
     */
    public String getJobDegree() {
        return jobDegree;
    }

    /**
     * 设置学历要求
     *
     * @param jobDegree 学历要求
     */
    public void setJobDegree(String jobDegree) {
        this.jobDegree = jobDegree;
    }

    /**
     * 获取招聘人数
     *
     * @return job_need_number - 招聘人数
     */
    public Integer getJobNeedNumber() {
        return jobNeedNumber;
    }

    /**
     * 设置招聘人数
     *
     * @param jobNeedNumber 招聘人数
     */
    public void setJobNeedNumber(Integer jobNeedNumber) {
        this.jobNeedNumber = jobNeedNumber;
    }

    /**
     * 获取发布时间
     *
     * @return job_publish_time - 发布时间
     */
    public Date getJobPublishTime() {
        return jobPublishTime;
    }

    /**
     * 设置发布时间
     *
     * @param jobPublishTime 发布时间
     */
    public void setJobPublishTime(Date jobPublishTime) {
        this.jobPublishTime = jobPublishTime;
    }

    /**
     * 获取福利
     *
     * @return job_welfare - 福利
     */
    public String getJobWelfare() {
        return jobWelfare;
    }

    /**
     * 设置福利
     *
     * @param jobWelfare 福利
     */
    public void setJobWelfare(String jobWelfare) {
        this.jobWelfare = jobWelfare;
    }

    /**
     * 获取职位职责
     *
     * @return job_duty - 职位职责
     */
    public String getJobDuty() {
        return jobDuty;
    }

    /**
     * 设置职位职责
     *
     * @param jobDuty 职位职责
     */
    public void setJobDuty(String jobDuty) {
        this.jobDuty = jobDuty;
    }

    /**
     * 获取职位要求
     *
     * @return job_demand - 职位要求
     */
    public String getJobDemand() {
        return jobDemand;
    }

    /**
     * 设置职位要求
     *
     * @param jobDemand 职位要求
     */
    public void setJobDemand(String jobDemand) {
        this.jobDemand = jobDemand;
    }

    /**
     * 获取职位具体地点
     *
     * @return job_addr_detail - 职位具体地点
     */
    public String getJobAddrDetail() {
        return jobAddrDetail;
    }

    /**
     * 设置职位具体地点
     *
     * @param jobAddrDetail 职位具体地点
     */
    public void setJobAddrDetail(String jobAddrDetail) {
        this.jobAddrDetail = jobAddrDetail;
    }

    /**
     * 获取最低薪资
     *
     * @return job_min_salary - 最低薪资
     */
    public BigDecimal getJobMinSalary() {
        return jobMinSalary;
    }

    /**
     * 设置最低薪资
     *
     * @param jobMinSalary 最低薪资
     */
    public void setJobMinSalary(BigDecimal jobMinSalary) {
        this.jobMinSalary = jobMinSalary;
    }

    /**
     * 获取最高薪资
     *
     * @return job_max_salary - 最高薪资
     */
    public BigDecimal getJobMaxSalary() {
        return jobMaxSalary;
    }

    /**
     * 设置最高薪资
     *
     * @param jobMaxSalary 最高薪资
     */
    public void setJobMaxSalary(BigDecimal jobMaxSalary) {
        this.jobMaxSalary = jobMaxSalary;
    }

    /**
     * 获取搜索关键字
     *
     * @return job_search_keyword - 搜索关键字
     */
    public String getJobSearchKeyword() {
        return jobSearchKeyword;
    }

    /**
     * 设置搜索关键字
     *
     * @param jobSearchKeyword 搜索关键字
     */
    public void setJobSearchKeyword(String jobSearchKeyword) {
        this.jobSearchKeyword = jobSearchKeyword;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * @param other1
     */
    public void setOther1(String other1) {
        this.other1 = other1;
    }

    /**
     * @return other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * @param other2
     */
    public void setOther2(String other2) {
        this.other2 = other2;
    }
}