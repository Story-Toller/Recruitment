package com.yun.beans.vo;


import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.entity.Job;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobComAdminVO {
    private Job job;
    private CompanyAdmin companyAdmin;

}
