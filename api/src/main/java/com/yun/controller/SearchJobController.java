package com.yun.controller;

import com.yun.beans.entity.Customer;
import com.yun.service.business.JobSearchService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
@Api(value = "搜索", tags = "搜索职位")
@CrossOrigin
public class SearchJobController {

    @Autowired
    JobSearchService jobSearchService;

    @ApiOperation("根据关键字搜素职位")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "keyword", value = "关键字", required = true),
            @ApiImplicitParam(dataType = "String", name = "pageNum", value = "页码", required = true),
            @ApiImplicitParam(dataType = "String", name = "limit", value = "每页数量", required = true)
    })
    @GetMapping("/jobs")
    public ResultVo jobs(String keyword, int pageNum, int limit) {
        ResultVo resultVo = jobSearchService.searchJob(keyword, pageNum, limit);
        return resultVo;

    }

}
