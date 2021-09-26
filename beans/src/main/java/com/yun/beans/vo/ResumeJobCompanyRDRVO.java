package com.yun.beans.vo;


import com.yun.beans.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeJobCompanyRDRVO {
    private Resume resume;
    private Job job;
    private Company company;
    private ResumeDeliveryRecord resumeDeliveryRecord;
}
