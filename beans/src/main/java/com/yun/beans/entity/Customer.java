package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

public class Customer {
    /**
     * 用户id
     */
    @Id
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 用户名
     */
    @Column(name = "cust_name")
    private String custName;

    /**
     * 用户手机
     */
    @Column(name = "cust_telno")
    private Long custTelno;

    /**
     * 用户邮箱
     */
    @Column(name = "cust_email")
    private String custEmail;

    /**
     * 用户密码
     */
    @Column(name = "cust_password")
    private String custPassword;

    /**
     * 注册时间
     */
    @Column(name = "cust_regist_time")
    private Date custRegistTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 更改为用户头像
     *
     */
    private String other1;

    /**
     * 备用字段2
     */
    private String other2;

    /**
     * 获取用户id
     *
     * @return cust_id - 用户id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 设置用户id
     *
     * @param custId 用户id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 获取用户名
     *
     * @return cust_name - 用户名
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置用户名
     *
     * @param custName 用户名
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取用户手机
     *
     * @return cust_telno - 用户手机
     */
    public Long getCustTelno() {
        return custTelno;
    }

    /**
     * 设置用户手机
     *
     * @param custTelno 用户手机
     */
    public void setCustTelno(Long custTelno) {
        this.custTelno = custTelno;
    }

    /**
     * 获取用户邮箱
     *
     * @return cust_email - 用户邮箱
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * 设置用户邮箱
     *
     * @param custEmail 用户邮箱
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    /**
     * 获取用户密码
     *
     * @return cust_password - 用户密码
     */
    public String getCustPassword() {
        return custPassword;
    }

    /**
     * 设置用户密码
     *
     * @param custPassword 用户密码
     */
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    /**
     * 获取注册时间
     *
     * @return cust_regist_time - 注册时间
     */
    public Date getCustRegistTime() {
        return custRegistTime;
    }

    /**
     * 设置注册时间
     *
     * @param custRegistTime 注册时间
     */
    public void setCustRegistTime(Date custRegistTime) {
        this.custRegistTime = custRegistTime;
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
     * 获取备用字段1
     *
     * @return other1 - 备用字段1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * 设置备用字段1
     *
     * @param other1 备用字段1
     */
    public void setOther1(String other1) {
        this.other1 = other1;
    }

    /**
     * 获取备用字段2
     *
     * @return other2 - 备用字段2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * 设置备用字段2
     *
     * @param other2 备用字段2
     */
    public void setOther2(String other2) {
        this.other2 = other2;
    }
}