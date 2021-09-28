package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

public class Honor {
    /**
     * 获奖id
     */
    @Id
    @Column(name = "honor_id")
    private Integer honorId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 获奖时间
     */
    @Column(name = "honor_create_time")
    private Date honorCreateTime;

    /**
     * 奖项名称
     */
    @Column(name = "honor_name")
    private String honorName;

    /**
     * 获奖等级
     */
    @Column(name = "honor_grade")
    private String honorGrade;

    private Integer status;

    private String other1;

    /**
     * 获取获奖id
     *
     * @return honor_id - 获奖id
     */
    public Integer getHonorId() {
        return honorId;
    }

    /**
     * 设置获奖id
     *
     * @param honorId 获奖id
     */
    public void setHonorId(Integer honorId) {
        this.honorId = honorId;
    }

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
     * 获取获奖时间
     *
     * @return honor_create_time - 获奖时间
     */
    public Date getHonorCreateTime() {
        return honorCreateTime;
    }

    /**
     * 设置获奖时间
     *
     * @param honorCreateTime 获奖时间
     */
    public void setHonorCreateTime(Date honorCreateTime) {
        this.honorCreateTime = honorCreateTime;
    }

    /**
     * 获取奖项名称
     *
     * @return honor_name - 奖项名称
     */
    public String getHonorName() {
        return honorName;
    }

    /**
     * 设置奖项名称
     *
     * @param honorName 奖项名称
     */
    public void setHonorName(String honorName) {
        this.honorName = honorName;
    }

    /**
     * 获取获奖等级
     *
     * @return honor_grade - 获奖等级
     */
    public String getHonorGrade() {
        return honorGrade;
    }

    /**
     * 设置获奖等级
     *
     * @param honorGrade 获奖等级
     */
    public void setHonorGrade(String honorGrade) {
        this.honorGrade = honorGrade;
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
}