package com.yun.beans.entity;

import lombok.*;

import java.util.Date;
import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "work_experience")
public class WorkExperience {
    /**
     * 工作经验id
     */
    @Id
    @Column(name = "work_experi_id")
    private Integer workExperiId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 工作经验开始时间
     */
    @Column(name = "work_start_time")
    private String workStartTime;

    /**
     * 工作经验结束时间
     */
    @Column(name = "work_end_time")
    private String workEndTime;

    /**
     * 工作经验所在公司名称
     */
    @Column(name = "work_company_name")
    private String workCompanyName;

    /**
     * 工作经验工作职位
     */
    @Column(name = "work_position")
    private String workPosition;

    /**
     * 工作经验所在部门名称
     */
    @Column(name = "work_department")
    private String workDepartment;

    /**
     * 工作经验公司规模
     */
    @Column(name = "work_company_scaler")
    private String workCompanyScaler;

    /**
     * 工作经验公司性质（外企国企私营等）
     */
    @Column(name = "work_company_property")
    private String workCompanyProperty;

    /**
     * 工作经验工作描述
     */
    @Column(name = "work_desc")
    private String workDesc;

    /**
     * 工作经验类型
     */
    @Column(name = "work_type")
    private String workType;

    private Integer status;

    private String other1;

    private String other2;

    /**
     * 获取工作经验id
     *
     * @return work_experi_id - 工作经验id
     */
    public Integer getWorkExperiId() {
        return workExperiId;
    }

    /**
     * 设置工作经验id
     *
     * @param workExperiId 工作经验id
     */
    public void setWorkExperiId(Integer workExperiId) {
        this.workExperiId = workExperiId;
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
     * 获取工作经验所在公司名称
     *
     * @return work_company_name - 工作经验所在公司名称
     */
    public String getWorkCompanyName() {
        return workCompanyName;
    }

    /**
     * 设置工作经验所在公司名称
     *
     * @param workCompanyName 工作经验所在公司名称
     */
    public void setWorkCompanyName(String workCompanyName) {
        this.workCompanyName = workCompanyName;
    }

    /**
     * 获取工作经验工作职位
     *
     * @return work_position - 工作经验工作职位
     */
    public String getWorkPosition() {
        return workPosition;
    }

    /**
     * 设置工作经验工作职位
     *
     * @param workPosition 工作经验工作职位
     */
    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    /**
     * 获取工作经验所在部门名称
     *
     * @return work_department - 工作经验所在部门名称
     */
    public String getWorkDepartment() {
        return workDepartment;
    }

    /**
     * 设置工作经验所在部门名称
     *
     * @param workDepartment 工作经验所在部门名称
     */
    public void setWorkDepartment(String workDepartment) {
        this.workDepartment = workDepartment;
    }

    /**
     * 获取工作经验公司规模
     *
     * @return work_company_scaler - 工作经验公司规模
     */
    public String getWorkCompanyScaler() {
        return workCompanyScaler;
    }

    /**
     * 设置工作经验公司规模
     *
     * @param workCompanyScaler 工作经验公司规模
     */
    public void setWorkCompanyScaler(String workCompanyScaler) {
        this.workCompanyScaler = workCompanyScaler;
    }

    /**
     * 获取工作经验公司性质（外企国企私营等）
     *
     * @return work_company_property - 工作经验公司性质（外企国企私营等）
     */
    public String getWorkCompanyProperty() {
        return workCompanyProperty;
    }

    /**
     * 设置工作经验公司性质（外企国企私营等）
     *
     * @param workCompanyProperty 工作经验公司性质（外企国企私营等）
     */
    public void setWorkCompanyProperty(String workCompanyProperty) {
        this.workCompanyProperty = workCompanyProperty;
    }

    /**
     * 获取工作经验工作描述
     *
     * @return work_desc - 工作经验工作描述
     */
    public String getWorkDesc() {
        return workDesc;
    }

    /**
     * 设置工作经验工作描述
     *
     * @param workDesc 工作经验工作描述
     */
    public void setWorkDesc(String workDesc) {
        this.workDesc = workDesc;
    }

    /**
     * 获取工作经验类型
     *
     * @return work_type - 工作经验类型
     */
    public String getWorkType() {
        return workType;
    }

    /**
     * 设置工作经验类型
     *
     * @param workType 工作经验类型
     */
    public void setWorkType(String workType) {
        this.workType = workType;
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