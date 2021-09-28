package com.yun.beans.vo;


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
