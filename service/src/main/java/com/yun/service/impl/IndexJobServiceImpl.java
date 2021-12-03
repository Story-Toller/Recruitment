package com.yun.service.impl;

import com.yun.beans.entity.*;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.dao.mapper.ResumeDeliveryRecordMapper;
import com.yun.service.business.IndexJobService;
import com.yun.sysytem.utils.PageHelper;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexJobServiceImpl implements IndexJobService {

    @Autowired
    JobMapper jobMapper;
    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    ResumeDeliveryRecordMapper resumeDeliveryRecordMapper;
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public ResultVo showHotJob(int pageNum, int limit) {
        int start = (pageNum - 1) * limit;
        List<JobVo> jobVos = jobMapper.indexShowJob(start, limit);
        int jobs = jobVos.size();
        int pageCount = jobs % limit == 0 ? jobs / limit : jobs / limit + 1;
        PageHelper<JobVo> jobVoPageHelper = new PageHelper<>(jobs, pageCount, jobVos);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "NewJob", jobVoPageHelper);
        return resultVo;
    }

    @Override
    public ResultVo indexFullJob(int pageNum, int limit) {
        int start = (pageNum - 1) * limit;
        List<JobVo> jobVos = jobMapper.indexFullJob(start,limit);
        int jobs = jobVos.size();
        int pageCount = jobs % limit == 0 ? jobs / limit : jobs / limit + 1;
        PageHelper<JobVo> jobVoPageHelper = new PageHelper<>(jobs, pageCount, jobVos);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "FullJOb", jobVoPageHelper);
        return resultVo;
    }

    @Override
    public ResultVo indexPartJob(int pageNum, int limit) {
        int start = (pageNum - 1) * limit;
        List<JobVo> jobVos = jobMapper.indexPartJob(start,limit);
        int jobs = jobVos.size();
        int pageCount = jobs % limit == 0 ? jobs / limit : jobs / limit + 1;
        PageHelper<JobVo> jobVoPageHelper = new PageHelper<>(jobs, pageCount, jobVos);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "PartJob", jobVoPageHelper);
        return resultVo;
    }

    @Override
    public ResultVo companyNumber() {
        Company company1 = new Company();
        int i = companyMapper.selectCount(company1);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "入驻公司数量", i);
        return resultVo;
    }

    @Override
    public ResultVo deliverNumber() {
        ResumeDeliveryRecord resumeDeliveryRecord = new ResumeDeliveryRecord();
        int i = resumeDeliveryRecordMapper.selectCount(resumeDeliveryRecord);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "投递成功数", i);
        return resultVo;
    }

    @Override
    public ResultVo jobNumber() {
        Job job = new Job();
        int i = jobMapper.selectCount(job);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "职位信息数", i);
        return resultVo;
    }

    @Override
    public ResultVo customerNumber() {
        Customer customer = new Customer();
        int i = customerMapper.selectCount(customer);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "用户数量", i);
        return resultVo;
    }
}
