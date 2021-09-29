package com.yun.dao.mapper;

import com.yun.beans.entity.Job;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobMapper extends FamilyMapper<Job> {
}