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
@Table(name = "work_experience")
@ApiModel(value = "WorkExperience对象", description = "工作经验信息")
public class WorkExperience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_experi_id")
    private Integer workExperiId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "work_start_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date workStartTime;

    @Column(name = "work_end_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date workEndTime;

    @Column(name = "work_company_name")
    private String workCompanyName;

    @Column(name = "work_position")
    private String workPosition;

    @Column(name = "work_department")
    private String workDepartment;

    @Column(name = "work_company_scaler")
    private String workCompanyScaler;

    @Column(name = "work_company_property")
    private String workCompanyProperty;

    @Column(name = "work_desc")
    private String workDesc;

    @Column(name = "work_type")
    private String workType;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}