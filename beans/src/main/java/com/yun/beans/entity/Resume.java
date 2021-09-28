package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

public class Resume {
    /**
     * 简历id
     */
    @Id
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 简历名称
     */
    @Column(name = "resume_name")
    private String resumeName;

    /**
     * 简历创建时间
     */
    @Column(name = "resume_create_time")
    private Date resumeCreateTime;

    /**
     * 简历修改时间
     */
    @Column(name = "resume_update_time")
    private Date resumeUpdateTime;

    /**
     * 简历中头像
     */
    @Column(name = "resume_profile")
    private String resumeProfile;

    /**
     * 简历中用户出生日期
     */
    @Column(name = "resume_birth")
    private Date resumeBirth;

    /**
     * 简历中用户手机
     */
    @Column(name = "resume_telno")
    private Long resumeTelno;

    /**
     * 简历中用户邮箱
     */
    @Column(name = "resume_email")
    private String resumeEmail;

    /**
     * 简历中用户性别
     */
    @Column(name = "resume_gender")
    private String resumeGender;

    /**
     * 简历中用户在职或离职情况
     */
    @Column(name = "resume_leaving__working")
    private String resumeLeavingWorking;

    /**
     * 简历中用户居住地
     */
    @Column(name = "resume_live_city")
    private String resumeLiveCity;

    /**
     * 简历中用户身份证
     */
    @Column(name = "resume_personid")
    private String resumePersonid;

    /**
     * 简历中用户年收入
     */
    @Column(name = "resume_income")
    private Integer resumeIncome;

    /**
     * 简历中用户兼职或全职
     */
    @Column(name = "resume_full_part_time")
    private String resumeFullPartTime;

    private Integer status;

    private String other1;

    private String other2;

    /**
     * 获取简历id
     *
     * @return resume_id - 简历id
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * 设置简历id
     *
     * @param resumeId 简历id
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
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
     * 获取简历名称
     *
     * @return resume_name - 简历名称
     */
    public String getResumeName() {
        return resumeName;
    }

    /**
     * 设置简历名称
     *
     * @param resumeName 简历名称
     */
    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    /**
     * 获取简历创建时间
     *
     * @return resume_create_time - 简历创建时间
     */
    public Date getResumeCreateTime() {
        return resumeCreateTime;
    }

    /**
     * 设置简历创建时间
     *
     * @param resumeCreateTime 简历创建时间
     */
    public void setResumeCreateTime(Date resumeCreateTime) {
        this.resumeCreateTime = resumeCreateTime;
    }

    /**
     * 获取简历修改时间
     *
     * @return resume_update_time - 简历修改时间
     */
    public Date getResumeUpdateTime() {
        return resumeUpdateTime;
    }

    /**
     * 设置简历修改时间
     *
     * @param resumeUpdateTime 简历修改时间
     */
    public void setResumeUpdateTime(Date resumeUpdateTime) {
        this.resumeUpdateTime = resumeUpdateTime;
    }

    /**
     * 获取简历中头像
     *
     * @return resume_profile - 简历中头像
     */
    public String getResumeProfile() {
        return resumeProfile;
    }

    /**
     * 设置简历中头像
     *
     * @param resumeProfile 简历中头像
     */
    public void setResumeProfile(String resumeProfile) {
        this.resumeProfile = resumeProfile;
    }

    /**
     * 获取简历中用户出生日期
     *
     * @return resume_birth - 简历中用户出生日期
     */
    public Date getResumeBirth() {
        return resumeBirth;
    }

    /**
     * 设置简历中用户出生日期
     *
     * @param resumeBirth 简历中用户出生日期
     */
    public void setResumeBirth(Date resumeBirth) {
        this.resumeBirth = resumeBirth;
    }

    /**
     * 获取简历中用户手机
     *
     * @return resume_telno - 简历中用户手机
     */
    public Long getResumeTelno() {
        return resumeTelno;
    }

    /**
     * 设置简历中用户手机
     *
     * @param resumeTelno 简历中用户手机
     */
    public void setResumeTelno(Long resumeTelno) {
        this.resumeTelno = resumeTelno;
    }

    /**
     * 获取简历中用户邮箱
     *
     * @return resume_email - 简历中用户邮箱
     */
    public String getResumeEmail() {
        return resumeEmail;
    }

    /**
     * 设置简历中用户邮箱
     *
     * @param resumeEmail 简历中用户邮箱
     */
    public void setResumeEmail(String resumeEmail) {
        this.resumeEmail = resumeEmail;
    }

    /**
     * 获取简历中用户性别
     *
     * @return resume_gender - 简历中用户性别
     */
    public String getResumeGender() {
        return resumeGender;
    }

    /**
     * 设置简历中用户性别
     *
     * @param resumeGender 简历中用户性别
     */
    public void setResumeGender(String resumeGender) {
        this.resumeGender = resumeGender;
    }

    /**
     * 获取简历中用户在职或离职情况
     *
     * @return resume_leaving__working - 简历中用户在职或离职情况
     */
    public String getResumeLeavingWorking() {
        return resumeLeavingWorking;
    }

    /**
     * 设置简历中用户在职或离职情况
     *
     * @param resumeLeavingWorking 简历中用户在职或离职情况
     */
    public void setResumeLeavingWorking(String resumeLeavingWorking) {
        this.resumeLeavingWorking = resumeLeavingWorking;
    }

    /**
     * 获取简历中用户居住地
     *
     * @return resume_live_city - 简历中用户居住地
     */
    public String getResumeLiveCity() {
        return resumeLiveCity;
    }

    /**
     * 设置简历中用户居住地
     *
     * @param resumeLiveCity 简历中用户居住地
     */
    public void setResumeLiveCity(String resumeLiveCity) {
        this.resumeLiveCity = resumeLiveCity;
    }

    /**
     * 获取简历中用户身份证
     *
     * @return resume_personid - 简历中用户身份证
     */
    public String getResumePersonid() {
        return resumePersonid;
    }

    /**
     * 设置简历中用户身份证
     *
     * @param resumePersonid 简历中用户身份证
     */
    public void setResumePersonid(String resumePersonid) {
        this.resumePersonid = resumePersonid;
    }

    /**
     * 获取简历中用户年收入
     *
     * @return resume_income - 简历中用户年收入
     */
    public Integer getResumeIncome() {
        return resumeIncome;
    }

    /**
     * 设置简历中用户年收入
     *
     * @param resumeIncome 简历中用户年收入
     */
    public void setResumeIncome(Integer resumeIncome) {
        this.resumeIncome = resumeIncome;
    }

    /**
     * 获取简历中用户兼职或全职
     *
     * @return resume_full_part_time - 简历中用户兼职或全职
     */
    public String getResumeFullPartTime() {
        return resumeFullPartTime;
    }

    /**
     * 设置简历中用户兼职或全职
     *
     * @param resumeFullPartTime 简历中用户兼职或全职
     */
    public void setResumeFullPartTime(String resumeFullPartTime) {
        this.resumeFullPartTime = resumeFullPartTime;
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