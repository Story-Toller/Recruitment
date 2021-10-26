package com.yun.beans.entity;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "project_experience")
public class ProjectExperience {
    /**
     * 项目经验id
     */
    @Id
    @Column(name = "project_experi_id")
    private Integer projectExperiId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 项目所在公司名
     */
    @Column(name = "project_company_name")
    private String projectCompanyName;

    /**
     * 项目经验开始时间
     */
    @Column(name = "project_start_time")
    private String projectStartTime;

    /**
     * 项目经验结束时间
     */
    @Column(name = "project_end_time")
    private String projectEndTime;

    /**
     * 项目经验名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目内容描述
     */
    @Column(name = "project_content_desc")
    private String projectContentDesc;

    /**
     * 项目职责描述
     */
    @Column(name = "project_duty_desc")
    private String projectDutyDesc;

    private Integer status;

    private String other1;

    private String other2;

    /**
     * 获取项目经验id
     *
     * @return project_experi_id - 项目经验id
     */
    public Integer getProjectExperiId() {
        return projectExperiId;
    }

    /**
     * 设置项目经验id
     *
     * @param projectExperiId 项目经验id
     */
    public void setProjectExperiId(Integer projectExperiId) {
        this.projectExperiId = projectExperiId;
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
     * 获取项目所在公司名
     *
     * @return project_company_name - 项目所在公司名
     */
    public String getProjectCompanyName() {
        return projectCompanyName;
    }

    /**
     * 设置项目所在公司名
     *
     * @param projectCompanyName 项目所在公司名
     */
    public void setProjectCompanyName(String projectCompanyName) {
        this.projectCompanyName = projectCompanyName;
    }

    /**
     * 获取项目经验开始时间
     *
     * @return project_start_time - 项目经验开始时间
     */


    /**
     * 获取项目经验名称
     *
     * @return project_name - 项目经验名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目经验名称
     *
     * @param projectName 项目经验名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取项目内容描述
     *
     * @return project_content_desc - 项目内容描述
     */
    public String getProjectContentDesc() {
        return projectContentDesc;
    }

    /**
     * 设置项目内容描述
     *
     * @param projectContentDesc 项目内容描述
     */
    public void setProjectContentDesc(String projectContentDesc) {
        this.projectContentDesc = projectContentDesc;
    }

    /**
     * 获取项目职责描述
     *
     * @return project_duty_desc - 项目职责描述
     */
    public String getProjectDutyDesc() {
        return projectDutyDesc;
    }

    /**
     * 设置项目职责描述
     *
     * @param projectDutyDesc 项目职责描述
     */
    public void setProjectDutyDesc(String projectDutyDesc) {
        this.projectDutyDesc = projectDutyDesc;
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