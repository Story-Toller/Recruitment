package com.yun.beans.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Education {
    @Id
    @Column(name = "edu_id")
    private Integer eduId;

    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 学历等级
     */
    @Column(name = "edu_level")
    private String eduLevel;

    /**
     * 学历学校名称
     */
    @Column(name = "edu_name")
    private String eduName;

    /**
     * 入学日期
     */
    @Column(name = "edu_start")
    private String eduStart;

    /**
     * 毕业日期
     */
    @Column(name = "edu_stop")
    private String eduStop;

    /**
     * 专业
     */
    @Column(name = "edu_pro")
    private String eduPro;

    /**
     * @return edu_id
     */
    public Integer getEduId() {
        return eduId;
    }

    /**
     * @param eduId
     */
    public void setEduId(Integer eduId) {
        this.eduId = eduId;
    }

    /**
     * @return resume_id
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * @param resumeId
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * 获取学历等级
     *
     * @return edu_level - 学历等级
     */
    public String getEduLevel() {
        return eduLevel;
    }

    /**
     * 设置学历等级
     *
     * @param eduLevel 学历等级
     */
    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    /**
     * 获取学历学校名称
     *
     * @return edu_name - 学历学校名称
     */
    public String getEduName() {
        return eduName;
    }

    /**
     * 设置学历学校名称
     *
     * @param eduName 学历学校名称
     */
    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    /**
     * 获取入学日期
     *
     * @return edu_start - 入学日期
     */
    public String getEduStart() {
        return eduStart;
    }

    /**
     * 设置入学日期
     *
     * @param eduStart 入学日期
     */
    public void setEduStart(String eduStart) {
        this.eduStart = eduStart;
    }

    /**
     * 获取毕业日期
     *
     * @return edu_stop - 毕业日期
     */
    public String getEduStop() {
        return eduStop;
    }

    /**
     * 设置毕业日期
     *
     * @param eduStop 毕业日期
     */
    public void setEduStop(String eduStop) {
        this.eduStop = eduStop;
    }

    /**
     * 获取专业
     *
     * @return edu_pro - 专业
     */
    public String getEduPro() {
        return eduPro;
    }

    /**
     * 设置专业
     *
     * @param eduPro 专业
     */
    public void setEduPro(String eduPro) {
        this.eduPro = eduPro;
    }
}