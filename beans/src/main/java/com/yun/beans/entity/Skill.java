package com.yun.beans.entity;

import javax.persistence.*;

public class Skill {
    /**
     * 专业技能id
     */
    @Id
    @Column(name = "skill_id")
    private Integer skillId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 专业技能名称
     */
    @Column(name = "skill_name")
    private String skillName;

    /**
     * 专业技能描述
     */
    @Column(name = "skill_desc")
    private String skillDesc;

    private Integer status;

    private String other1;

    private String other2;

    /**
     * 获取专业技能id
     *
     * @return skill_id - 专业技能id
     */
    public Integer getSkillId() {
        return skillId;
    }

    /**
     * 设置专业技能id
     *
     * @param skillId 专业技能id
     */
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
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
     * 获取专业技能名称
     *
     * @return skill_name - 专业技能名称
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * 设置专业技能名称
     *
     * @param skillName 专业技能名称
     */
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    /**
     * 获取专业技能描述
     *
     * @return skill_desc - 专业技能描述
     */
    public String getSkillDesc() {
        return skillDesc;
    }

    /**
     * 设置专业技能描述
     *
     * @param skillDesc 专业技能描述
     */
    public void setSkillDesc(String skillDesc) {
        this.skillDesc = skillDesc;
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