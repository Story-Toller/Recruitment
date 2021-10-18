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

    @Override
    public ResultVo showDesignJob() {
        List<JobVo> jobVos = jobMapper.showAdministrativeJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }

    @Override
    public ResultVo showMoneyJob() {
        List<JobVo> jobVos = jobMapper.showMoneyJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }

    @Override
    public ResultVo showSaleJob() {
        List<JobVo> jobVos = jobMapper.showSaleJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }

    @Override
    public ResultVo showEducationJob() {
        List<JobVo> jobVos = jobMapper.showEducationJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }

    @Override
    public ResultVo showHealthyJob() {
        List<JobVo> jobVos = jobMapper.showHealthyJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }

    @Override
    public ResultVo showDealJob() {
        List<JobVo> jobVos = jobMapper.showDealJob();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVos);
        return resultVo;
    }
}
