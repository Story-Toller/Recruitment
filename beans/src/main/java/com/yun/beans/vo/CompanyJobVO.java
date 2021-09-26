package com.yun.beans.vo;


import com.yun.beans.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyJobVO {
    private Job job;
    private Company company;
}
