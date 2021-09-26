package com.yun.beans.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "company_admin")
@ApiModel(value = "公司管理员对象", description = "HR信息")
public class CompanyAdmin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_admin_id")
    private Integer companyAdminId;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "company_admin_name")
    private String companyAdminName;

    @Column(name = "company_admin_telno")
    private Long companyAdminTelno;

    @Column(name = "company_admin_email")
    private String companyAdminEmail;

    @Column(name = "company_admin_password")
    private String companyAdminPassword;

    @Column(name = "company_admin_create_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date companyAdminCreateTime;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}