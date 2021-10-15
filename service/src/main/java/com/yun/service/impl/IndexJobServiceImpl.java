package com.yun.service.impl;

import com.yun.beans.entity.Job;
import com.yun.beans.entity.JobVo;
import com.yun.dao.mapper.JobMapper;
import com.yun.service.business.IndexJobService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexJobServiceImpl implements IndexJobService {

    @Autowired
    JobMapper jobMapper;

    @Override
    public ResultVo showHotJob() {
        List<JobVo> jobVos = jobMapper.indexShowJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "sucess", jobVos);
        return resultVo;
    }
}
