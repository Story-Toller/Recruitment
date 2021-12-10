package com.yun.service.impl;

import com.yun.beans.entity.Company;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.service.business.CompanyService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public ResultVo showAllCompanyInfo(int companyId) {
        List<Company> companies = companyMapper.showAllCompanyInfo(companyId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", companies);
        return resultVo;
    }

    @Override
    public ResultVo showAllCompany() {
        List<Company> companies = companyMapper.selectAll();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "公司展示", companies);
        return resultVo;
    }
}
