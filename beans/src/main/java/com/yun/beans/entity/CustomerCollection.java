package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "customer_collection")
public class CustomerCollection {
    /**
     * 收藏id
     */
    @Id
    @Column(name = "collection_id")
    private Integer collectionId;

    /**
     * 职位信息id
     */
    @Column(name = "job_id")
    private String jobId;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 收藏时间
     */
    @Column(name = "collection_time")
    private String collectionTime;

    /**
     * 获取收藏id
     *
     * @return collection_id - 收藏id
     */
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     * 设置收藏id
     *
     * @param collectionId 收藏id
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 获取职位信息id
     *
     * @return job_id - 职位信息id
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 设置职位信息id
     *
     * @param jobId 职位信息id
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
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
     * 获取收藏时间
     *
     * @return collection_time - 收藏时间
     */
    public String getCollectionTime() {
        return collectionTime;
    }

    /**
     * 设置收藏时间
     *
     * @param collectionTime 收藏时间
     */
    public void setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
    }
}