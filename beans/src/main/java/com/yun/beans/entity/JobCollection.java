package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "job_collection")
public class JobCollection {
    /**
     * 职位收藏id
     */
    @Id
    @Column(name = "job_collection_id")
    private Integer jobCollectionId;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 职位id
     */
    @Column(name = "job_id")
    private Integer jobId;

    /**
     * 收藏时间
     */
    @Column(name = "collect_time")
    private Date collectTime;

    private String status;

    private String other1;

    private String other2;

    /**
     * 获取职位收藏id
     *
     * @return job_collection_id - 职位收藏id
     */
    public Integer getJobCollectionId() {
        return jobCollectionId;
    }

    /**
     * 设置职位收藏id
     *
     * @param jobCollectionId 职位收藏id
     */
    public void setJobCollectionId(Integer jobCollectionId) {
        this.jobCollectionId = jobCollectionId;
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
     * 获取收藏时间
     *
     * @return collect_time - 收藏时间
     */
    public Date getCollectTime() {
        return collectTime;
    }

    /**
     * 设置收藏时间
     *
     * @param collectTime 收藏时间
     */
    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
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