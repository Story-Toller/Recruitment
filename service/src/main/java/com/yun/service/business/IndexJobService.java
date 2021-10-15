package com.yun.service.business;


import com.yun.sysytem.vo.ResultVo;

import java.util.List;

public interface IndexJobService {

//    热门职位首页展示
    ResultVo showHotJob();
    //    首页展示全职工作
    ResultVo indexFullJob();

    //    首页展示兼职工作
    ResultVo indexPartJob();
}
