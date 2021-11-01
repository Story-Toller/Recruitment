package com.yun.dao.mapper;

import com.yun.beans.entity.Education;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EducationMapper extends FamilyMapper<Education> {
}