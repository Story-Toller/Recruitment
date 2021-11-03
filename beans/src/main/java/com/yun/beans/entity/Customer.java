package com.yun.beans.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String custRegistTime;

    /**
     * 更改为用户性别
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


}