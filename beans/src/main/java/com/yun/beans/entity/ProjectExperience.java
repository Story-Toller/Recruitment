package com.yun.beans.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project_experience")
@ApiModel(value = "Project对象", description = "项目经历信息")
public class ProjectExperience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_experi_id")
    private Integer projectExperiId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "project_company_name")
    private String projectCompanyName;

    @Column(name = "project_start_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date projectStartTime;

    @Column(name = "project_end_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date projectEndTime;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_content_desc")
    private String projectContentDesc;

    @Column(name = "project_duty_desc")
    private String projectDutyDesc;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}