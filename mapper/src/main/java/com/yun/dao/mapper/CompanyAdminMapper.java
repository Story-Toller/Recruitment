package com.yun.dao.mapper;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyAdminMapper extends FamilyMapper<CompanyAdmin> {
}