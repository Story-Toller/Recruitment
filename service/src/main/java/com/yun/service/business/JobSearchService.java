package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface JobSearchService {
    ResultVo searchJob(String keyword, int pageNum, int limit);
}
