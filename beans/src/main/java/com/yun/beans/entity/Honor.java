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
@Table(name = "honor")
@ApiModel(value = "Honor对象", description = "获奖信息")
public class Honor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "honor_id")
    private Integer honorId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "honor_create_time")
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date honorCreateTime;

    @Column(name = "honor_name")
    private String honorName;

    @Column(name = "honor_grade")
    private String honorGrade;

    @Column(name = "status")
    private Integer status;

    @Column(name = "other1")
    private String other1;
}