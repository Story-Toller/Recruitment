package com.yun.service.impl;

import com.yun.beans.entity.Company;
import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.entity.Job;
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

    @Autowired
    CompanyMapper companyMapper;

    @Autowired
    CompanyAdminMapper companyAdminMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVo getJobInfor(String jobId) {

//        查询职位基本信息
        Example example = new Example(Job.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("jobId", jobId);
        criteria.andEqualTo("jobStatus", 1);//状态为1表示有效信息
        List<Job> jobs = jobMapper.selectByExample(example);
        if (jobs.size() > 0) {
//            查询职位对应公司信息
            Example example1 = new Example(Company.class);
            Example.Criteria criteria1 = example1.createCriteria();
            criteria1.andEqualTo("companyId",jobId);
            List<Company> companies = companyMapper.selectByExample(example1);

//            查询职位对应hr信息
            Example example2 = new Example(CompanyAdmin.class);
            Example.Criteria criteria2 = example2.createCriteria();
            criteria2.andEqualTo("companyAdminId", jobId);
            List<CompanyAdmin> companyAdmins = companyAdminMapper.selectByExample(example2);

            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("jobBashInfo", jobs.get(0));
            hashMap.put("jobCompanyInfo", companies);
            hashMap.put("jobComAdminInfo", companyAdmins);

            return new ResultVo(ResStatus.OK, "success", hashMap);
        } else {
            return new ResultVo(ResStatus.NO, "failed", null);
        }


    }
}

