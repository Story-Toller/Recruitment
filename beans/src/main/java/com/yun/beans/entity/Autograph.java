package com.yun.beans.entity;

import javax.persistence.*;

public class Autograph {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 签名内容
     */
    @Column(name = "cust_autograph")
    private String custAutograph;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * 获取签名内容
     *
     * @return cust_autograph - 签名内容
     */
    public String getCustAutograph() {
        return custAutograph;
    }

    /**
     * 设置签名内容
     *
     * @param custAutograph 签名内容
     */
    public void setCustAutograph(String custAutograph) {
        this.custAutograph = custAutograph;
    }
}