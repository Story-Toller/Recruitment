package com.yun.beans.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skill")
@ApiModel(value = "Skill对象", description = "技能信息")
public class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Integer skillId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "skill_name")
    private String skillName;

    @Column(name = "skill_desc")
    private String skillDesc;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}