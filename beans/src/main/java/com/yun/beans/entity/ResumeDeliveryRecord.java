package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "resume_delivery_record")
public class ResumeDeliveryRecord {
    /**
     * 简历投递记录id
     */
    @Id
    @Column(name = "resume_delivery_record_id")
    private Integer resumeDeliveryRecordId;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 职位id
     */
    @Column(name = "job_id")
    private Integer jobId;

    /**
     * 投递时间
     */
    @Column(name = "delivery_time")
    private String deliveryTime;

    @Column(name = "delivery_status")
    private Integer deliveryStatus;

    private String other1;

    private String other2;

    /**
     * 获取简历投递记录id
     *
     * @return resume_delivery_record_id - 简历投递记录id
     */
    public Integer getResumeDeliveryRecordId() {
        return resumeDeliveryRecordId;
    }

    /**
     * 设置简历投递记录id
     *
     * @param resumeDeliveryRecordId 简历投递记录id
     */
    public void setResumeDeliveryRecordId(Integer resumeDeliveryRecordId) {
        this.resumeDeliveryRecordId = resumeDeliveryRecordId;
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
     * 获取职位id
     *
     * @return job_id - 职位id
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * 设置职位id
     *
     * @param jobId 职位id
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取投递时间
     *
     * @return delivery_time - 投递时间
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置投递时间
     *
     * @param deliveryTime 投递时间
     */
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * @return delivery_status
     */
    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * @param deliveryStatus
     */
    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
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