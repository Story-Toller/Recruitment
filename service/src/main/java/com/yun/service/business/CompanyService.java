package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface CompanyService {
    ResultVo showAllCompanyInfo(int companyId);

//    展示所有公司
    ResultVo showAllCompany();
}
