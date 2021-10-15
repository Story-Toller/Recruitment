package com.yun.dao.mapper;

import com.yun.beans.entity.Company;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper extends FamilyMapper<Company> {

    public List<Company> selectNameAndLogoById();

}