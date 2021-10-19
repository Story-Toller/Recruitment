package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

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
    private Long companyAdminTelno;

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
    private Date companyAdminCreateTime;

    @Column(name = "company_admin_position")
    private String companyAdminPosition;

    @Column(name = "company_admin_img")
    private String companyAdminImg;



    private Integer status;

    private String other1;

    private String other2;

    /**
     * 获取公司管理员id
     *
     * @return company_admin_id - 公司管理员id
     */
    public Integer getCompanyAdminId() {
        return companyAdminId;
    }

    /**
     * 设置公司管理员id
     *
     * @param companyAdminId 公司管理员id
     */
    public void setCompanyAdminId(Integer companyAdminId) {
        this.companyAdminId = companyAdminId;
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
     * 获取公司管理员账户名
     *
     * @return company_admin_name - 公司管理员账户名
     */
    public String getCompanyAdminName() {
        return companyAdminName;
    }

    /**
     * 设置公司管理员账户名
     *
     * @param companyAdminName 公司管理员账户名
     */
    public void setCompanyAdminName(String companyAdminName) {
        this.companyAdminName = companyAdminName;
    }

    /**
     * 获取公司管理员账户手机
     *
     * @return company_admin_telno - 公司管理员账户手机
     */
    public Long getCompanyAdminTelno() {
        return companyAdminTelno;
    }

    /**
     * 设置公司管理员账户手机
     *
     * @param companyAdminTelno 公司管理员账户手机
     */
    public void setCompanyAdminTelno(Long companyAdminTelno) {
        this.companyAdminTelno = companyAdminTelno;
    }

    /**
     * 获取公司管理员账户邮箱
     *
     * @return company_admin_email - 公司管理员账户邮箱
     */
    public String getCompanyAdminEmail() {
        return companyAdminEmail;
    }

    /**
     * 设置公司管理员账户邮箱
     *
     * @param companyAdminEmail 公司管理员账户邮箱
     */
    public void setCompanyAdminEmail(String companyAdminEmail) {
        this.companyAdminEmail = companyAdminEmail;
    }

    /**
     * 获取公司管理员账户密码
     *
     * @return company_admin_password - 公司管理员账户密码
     */
    public String getCompanyAdminPassword() {
        return companyAdminPassword;
    }

    /**
     * 设置公司管理员账户密码
     *
     * @param companyAdminPassword 公司管理员账户密码
     */
    public void setCompanyAdminPassword(String companyAdminPassword) {
        this.companyAdminPassword = companyAdminPassword;
    }

    /**
     * 获取公司管理员账户创建时间
     *
     * @return company_admin_create_time - 公司管理员账户创建时间
     */
    public Date getCompanyAdminCreateTime() {
        return companyAdminCreateTime;
    }

    /**
     * 设置公司管理员账户创建时间
     *
     * @param companyAdminCreateTime 公司管理员账户创建时间
     */
    public void setCompanyAdminCreateTime(Date companyAdminCreateTime) {
        this.companyAdminCreateTime = companyAdminCreateTime;
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

    public String getCompanyAdminPosition() {
        return companyAdminPosition;
    }

    public void setCompanyAdminPosition(String companyAdminPosition) {
        this.companyAdminPosition = companyAdminPosition;
    }

    public String getCompanyAdminImg() {
        return companyAdminImg;
    }

    public void setCompanyAdminImg(String companyAdminImg) {
        this.companyAdminImg = companyAdminImg;
    }

    @Override
    public String toString() {
        return "CompanyAdmin{" +
                "companyAdminId=" + companyAdminId +
                ", companyId=" + companyId +
                ", companyAdminName='" + companyAdminName + '\'' +
                ", companyAdminTelno=" + companyAdminTelno +
                ", companyAdminEmail='" + companyAdminEmail + '\'' +
                ", companyAdminPassword='" + companyAdminPassword + '\'' +
                ", companyAdminCreateTime=" + companyAdminCreateTime +
                ", companyAdminPosition='" + companyAdminPosition + '\'' +
                ", companyAdminImg='" + companyAdminImg + '\'' +
                ", status=" + status +
                ", other1='" + other1 + '\'' +
                ", other2='" + other2 + '\'' +
                '}';
    }
}