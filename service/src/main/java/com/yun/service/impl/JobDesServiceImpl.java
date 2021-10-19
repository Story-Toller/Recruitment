package com.yun.service.impl;

import com.yun.beans.entity.Company;
import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.entity.Job;
import com.yun.beans.vo.JobDesVo;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.service.business.JobDesService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;

@Service
public class JobDesServiceImpl implements JobDesService {

    @Autowired
    JobMapper jobMapper;

    @Override
    public ResultVo showJobDesInfor(int jobId) {
        List<JobDesVo> jobDesVos = jobMapper.showJobDes(jobId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobDesVos);
        return resultVo;
    }
}

