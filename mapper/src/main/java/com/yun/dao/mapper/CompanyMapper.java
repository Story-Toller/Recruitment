package com.yun.dao.mapper;

import com.yun.beans.entity.Company;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper extends FamilyMapper<Company> {

     List<Company> selectNameAndLogoById();

//    通过companyId获取公司详情信息
    List<Company> showAllCompanyInfo(int companyId);

}