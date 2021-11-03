package com.yun.beans.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company_admin")
public class CompanyAdmin {
    /**
     * 公司管理员id
     */
    @Id
    @Column(name = "company_admin_id")
    private Integer companyAdminId;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 公司管理员账户名
     */
    @Column(name = "company_admin_name")
    private String companyAdminName;

    /**
     * 公司管理员账户手机
     */
    @Column(name = "company_admin_telno")
    private String companyAdminTelno;

    /**
     * 公司管理员账户邮箱
     */
    @Column(name = "company_admin_email")
    private String companyAdminEmail;

    /**
     * 公司管理员账户密码
     */
    @Column(name = "company_admin_password")
    private String companyAdminPassword;

    /**
     * 公司管理员账户创建时间
     */
    @Column(name = "company_admin_create_time")
    private String companyAdminCreateTime;

    @Column(name = "company_admin_position")
    private String companyAdminPosition;

    @Column(name = "company_admin_img")
    private String companyAdminImg;



    private Integer status;

    private String other1;

    private String other2;
}