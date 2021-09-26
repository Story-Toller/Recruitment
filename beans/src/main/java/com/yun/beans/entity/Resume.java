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
@Table(name = "resume")
@ApiModel(value = "Resume对象", description = "简历信息")
public class Resume implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "resume_name")
    private String resumeName;

    @Column(name = "resume_create_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date resumeCreateTime;

    @Column(name = "resume_update_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date resumeUpdateTime;

    @Column(name = "resume_profile")
    private String resumeProfile;

    @Column(name = "resume_birth")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date resumeBirth;

    @Column(name = "resume_telno")
    private Long resumeTelno;

    @Column(name = "resume_email")
    private String resumeEmail;

    @Column(name = "resume_gender")
    private String resumeGender;

    @Column(name = "resume_leaving__working")
    private String resumeLeavingWorking;

    @Column(name = "resume_live_city")
    private String resumeLiveCity;

    @Column(name = "resume_personid")
    private String resumePersonid;

    @Column(name = "resume_income")
    private Integer resumeIncome;

    @Column(name = "resume_full_part_time")
    private String resumeFullPartTime;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}