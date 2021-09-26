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
@Table(name = "resume_delivery_record")
@ApiModel(value = "Resume_other对象", description = "简历补充信息")
public class ResumeDeliveryRecord implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_delivery_record_id")
    private Integer resumeDeliveryRecordId;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "delivery_time")
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date deliveryTime;

    @Column(name = "delivery_status")
    private Integer deliveryStatus;

    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;
}