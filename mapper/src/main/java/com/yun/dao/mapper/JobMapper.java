package com.yun.dao.mapper;

import com.yun.beans.entity.Job;
import com.yun.beans.entity.JobVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobMapper extends FamilyMapper<Job> {
//      首页展示最新发布职业
    public List<JobVo> indexShowJob();

}