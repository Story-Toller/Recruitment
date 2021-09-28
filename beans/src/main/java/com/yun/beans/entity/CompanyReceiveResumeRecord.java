package com.yun.beans.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "company_receive_resume_record")
public class CompanyReceiveResumeRecord {
    /**
     * 公司收到简历记录id
     */
    @Id
    @Column(name = "company_receive_resume_record_id")
    private Integer companyReceiveResumeRecordId;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 公司收到简历时间
     */
    @Column(name = "receive_time")
    private Date receiveTime;

    /**
     * 公司管理员id
     */
    @Column(name = "company_admin_id")
    private Integer companyAdminId;

    private Integer status;

    private String other1;

    private String other2;

    /**
     * 获取公司收到简历记录id
     *
     * @return company_receive_resume_record_id - 公司收到简历记录id
     */
    public Integer getCompanyReceiveResumeRecordId() {
        return companyReceiveResumeRecordId;
    }

    /**
     * 设置公司收到简历记录id
     *
     * @param companyReceiveResumeRecordId 公司收到简历记录id
     */
    public void setCompanyReceiveResumeRecordId(Integer companyReceiveResumeRecordId) {
        this.companyReceiveResumeRecordId = companyReceiveResumeRecordId;
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
     * 获取公司收到简历时间
     *
     * @return receive_time - 公司收到简历时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置公司收到简历时间
     *
     * @param receiveTime 公司收到简历时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

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