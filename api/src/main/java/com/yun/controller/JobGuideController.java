package com.yun.controller;

import com.yun.service.business.JobGuideService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job-list")
@Api(value = "提供职位列表的接口", tags = "职位列表管理")
@CrossOrigin
public class JobGuideController {

    @Autowired
    JobGuideService jobGuideService;

    @GetMapping("/tel-job")
    @ApiOperation("查询技术职位的接口")
    public ResultVo showTelJob(){
        ResultVo resultVo = jobGuideService.showTelJob();
        return resultVo;
    }

    @GetMapping("/adm-job")
    @ApiOperation("查询行政职位的接口")
    public ResultVo showAdmJob(){
        ResultVo resultVo = jobGuideService.showAdmJob();
        return resultVo;
    }
}
