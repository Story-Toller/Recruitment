package com.yun.beans.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "company")
@ApiModel(value = "Company对象", description = "公司信息")
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_logo")
    private String companyLogo;

    @Column(name = "company_stage")
    private String companyStage;

    @Column(name = "company_emp_count")
    private String companyEmpCount;

    @Column(name = "company_industury")
    private String companyIndustury;

    @Column(name = "company_desc")
    private String companyDesc;

    @Column(name = "company_website")
    private String companyWebsite;

    @Column(name = "company_addr_province")
    private String companyAddrProvince;

    @Column(name = "company_addr_city")
    private String companyAddrCity;

    @Column(name = "company_addr_area")
    private String companyAddrArea;

    @Column(name = "company_adrr_detail")
    private String companyAdrrDetail;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}