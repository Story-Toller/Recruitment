package com.yun.beans.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
    /**
     * 简历id
     */
    @Id
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 简历名称
     */
    @Column(name = "resume_name")
    private String resumeName;

    public String getReusmeRealName() {
        return reusmeRealName;
    }

    public void setReusmeRealName(String reusmeRealName) {
        this.reusmeRealName = reusmeRealName;
    }

    /**
     * 用户真实姓名
     */
    @Column(name = "reusme_real_name")
    private String reusmeRealName;

    /**
     * 简历创建时间
     */
    @Column(name = "resume_create_time")
    private Date resumeCreateTime;

    /**
     * 简历修改时间
     */
    @Column(name = "resume_update_time")
    private Date resumeUpdateTime;

    /**
     * 简历中头像
     */
    @Column(name = "resume_profile")
    private String resumeProfile;
     /**
     * 简历中用户出生日期
     */
    @Column(name = "resume_birth")
    private String resumeBirth;

    /**
     * 简历中用户手机
     */
    @Column(name = "resume_telno")
    private String resumeTelno;

    /**
     * 简历中用户邮箱
     */
    @Column(name = "resume_email")
    private String resumeEmail;

    /**
     * 简历中用户性别
     */
    @Column(name = "resume_gender")
    private String resumeGender;

    /**
     * 简历中用户在职或离职情况
     */
    @Column(name = "resume_leaving__working")
    private String resumeLeavingWorking;

    /**
     * 简历中用户居住地
     */
    @Column(name = "resume_live_city")
    private String resumeLiveCity;

    /**
     * 简历中用户应聘职位
     */
    @Column(name = "resume_personid")
    private String resumePersonid;

    /**
     * 简历中用户年收入
     */
    @Column(name = "resume_income")
    private String resumeIncome;

    /**
     * 简历中用户兼职或全职
     */
    @Column(name = "resume_full_part_time")
    private String resumeFullPartTime;

    private Integer status;

    private String other1;

    private String other2;
}