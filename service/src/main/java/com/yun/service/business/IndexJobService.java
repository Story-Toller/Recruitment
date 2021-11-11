package com.yun.service.business;


import com.yun.beans.entity.Company;
import com.yun.sysytem.vo.ResultVo;

import java.util.List;

public interface IndexJobService {

    //    热门职位首页展示
    ResultVo showHotJob();

    //    首页展示全职工作
    ResultVo indexFullJob();

    //    首页展示兼职工作
    ResultVo indexPartJob();

    //    入驻企业数量
    ResultVo companyNumber();

    //    总投递数量
    ResultVo deliverNumber();

    //    职位数量
    ResultVo jobNumber();

    //    用户数量
    ResultVo customerNumber();
}
