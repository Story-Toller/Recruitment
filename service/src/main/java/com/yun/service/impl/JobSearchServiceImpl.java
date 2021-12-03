package com.yun.service.impl;

import com.yun.beans.entity.Job;
import com.yun.beans.entity.JobVo;
import com.yun.dao.mapper.JobMapper;
import com.yun.service.business.JobSearchService;
import com.yun.sysytem.utils.PageHelper;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class JobSearchServiceImpl implements JobSearchService {

    @Autowired
    JobMapper jobMapper;

    @Override
    public ResultVo searchJob(String keyword, int pageNum, int limit) {
        String kw = "%" + keyword + "%";
        int start = (pageNum - 1) * limit;
        List<JobVo> jobVos = jobMapper.selectByKeyWord(kw, start, limit);
//        Example example = new Example(Job.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("jobName", keyword);
//        int jobs = jobMapper.selectCountByExample(example);
        int jobs = jobVos.size();
        int pageCount = jobs % limit == 0 ? jobs / limit : jobs / limit + 1;
        PageHelper<JobVo> jobVoPageHelper = new PageHelper<>(jobs, pageCount, jobVos);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVoPageHelper);
        return resultVo;
    }
}
