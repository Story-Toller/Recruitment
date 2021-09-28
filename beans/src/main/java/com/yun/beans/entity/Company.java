package com.yun.beans.entity;

import javax.persistence.*;

public class Company {
    /**
     * 公司id
     */
    @Id
    @Column(name = "company_id")
    private Integer companyId;

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
     * 公司阶段
     */
    @Column(name = "company_stage")
    private String companyStage;

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
     * 公司网址
     */
    @Column(name = "company_website")
    private String companyWebsite;

    /**
     * 公司地址省份
     */
    @Column(name = "company_addr_province")
    private String companyAddrProvince;

    /**
     * 公司地址城市
     */
    @Column(name = "company_addr_city")
    private String companyAddrCity;

    /**
     * 公司地址区域
     */
    @Column(name = "company_addr_area")
    private String companyAddrArea;

    /**
     * 公司详细地址
     */
    @Column(name = "company_adrr_detail")
    private String companyAdrrDetail;

    private Integer status;

    private String other1;

    private String other2;

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
     * 获取公司名
     *
     * @return company_name - 公司名
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名
     *
     * @param companyName 公司名
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司logo
     *
     * @return company_logo - 公司logo
     */
    public String getCompanyLogo() {
        return companyLogo;
    }

    /**
     * 设置公司logo
     *
     * @param companyLogo 公司logo
     */
    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    /**
     * 获取公司阶段
     *
     * @return company_stage - 公司阶段
     */
    public String getCompanyStage() {
        return companyStage;
    }

    /**
     * 设置公司阶段
     *
     * @param companyStage 公司阶段
     */
    public void setCompanyStage(String companyStage) {
        this.companyStage = companyStage;
    }

    /**
     * 获取公司员工规模
     *
     * @return company_emp_count - 公司员工规模
     */
    public String getCompanyEmpCount() {
        return companyEmpCount;
    }

    /**
     * 设置公司员工规模
     *
     * @param companyEmpCount 公司员工规模
     */
    public void setCompanyEmpCount(String companyEmpCount) {
        this.companyEmpCount = companyEmpCount;
    }

    /**
     * 获取公司所属行业
     *
     * @return company_industury - 公司所属行业
     */
    public String getCompanyIndustury() {
        return companyIndustury;
    }

    /**
     * 设置公司所属行业
     *
     * @param companyIndustury 公司所属行业
     */
    public void setCompanyIndustury(String companyIndustury) {
        this.companyIndustury = companyIndustury;
    }

    /**
     * 获取公司简介
     *
     * @return company_desc - 公司简介
     */
    public String getCompanyDesc() {
        return companyDesc;
    }

    /**
     * 设置公司简介
     *
     * @param companyDesc 公司简介
     */
    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    /**
     * 获取公司网址
     *
     * @return company_website - 公司网址
     */
    public String getCompanyWebsite() {
        return companyWebsite;
    }

    /**
     * 设置公司网址
     *
     * @param companyWebsite 公司网址
     */
    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    /**
     * 获取公司地址省份
     *
     * @return company_addr_province - 公司地址省份
     */
    public String getCompanyAddrProvince() {
        return companyAddrProvince;
    }

    /**
     * 设置公司地址省份
     *
     * @param companyAddrProvince 公司地址省份
     */
    public void setCompanyAddrProvince(String companyAddrProvince) {
        this.companyAddrProvince = companyAddrProvince;
    }

    /**
     * 获取公司地址城市
     *
     * @return company_addr_city - 公司地址城市
     */
    public String getCompanyAddrCity() {
        return companyAddrCity;
    }

    /**
     * 设置公司地址城市
     *
     * @param companyAddrCity 公司地址城市
     */
    public void setCompanyAddrCity(String companyAddrCity) {
        this.companyAddrCity = companyAddrCity;
    }

    /**
     * 获取公司地址区域
     *
     * @return company_addr_area - 公司地址区域
     */
    public String getCompanyAddrArea() {
        return companyAddrArea;
    }

    /**
     * 设置公司地址区域
     *
     * @param companyAddrArea 公司地址区域
     */
    public void setCompanyAddrArea(String companyAddrArea) {
        this.companyAddrArea = companyAddrArea;
    }

    /**
     * 获取公司详细地址
     *
     * @return company_adrr_detail - 公司详细地址
     */
    public String getCompanyAdrrDetail() {
        return companyAdrrDetail;
    }

    /**
     * 设置公司详细地址
     *
     * @param companyAdrrDetail 公司详细地址
     */
    public void setCompanyAdrrDetail(String companyAdrrDetail) {
        this.companyAdrrDetail = companyAdrrDetail;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
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