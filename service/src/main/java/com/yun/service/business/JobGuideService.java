package com.yun.service.business;

import com.yun.beans.entity.JobVo;
import com.yun.sysytem.vo.ResultVo;

import java.util.List;

public interface JobGuideService {

    //    技术职位显示
    ResultVo showTelJob();

    //    行政职位展示
    ResultVo showAdmJob();

    //        设计类职位展示
    ResultVo showDesignJob();

    //        金融类职位展示
    ResultVo showMoneyJob();

    //        销售类职位展示
    ResultVo showSaleJob();

    //        教育类职位展示
    ResultVo showEducationJob();

    //        医疗类职位展示
    ResultVo showHealthyJob();

    //        运营类职位展示
    ResultVo showDealJob();
}
