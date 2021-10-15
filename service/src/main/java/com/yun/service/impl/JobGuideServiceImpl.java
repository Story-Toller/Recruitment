package com.yun.service.impl;

import com.yun.beans.entity.JobVo;
import com.yun.dao.mapper.JobMapper;
import com.yun.service.business.JobGuideService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobGuideServiceImpl implements JobGuideService {

    @Autowired
    JobMapper jobMapper;

    @Override
    public ResultVo showTelJob() {
        List<JobVo> jobVos = jobMapper.showTechnicalJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }

    @Override
    public ResultVo showAdmJob() {
        List<JobVo> jobVos = jobMapper.showAdministrativeJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }
}
