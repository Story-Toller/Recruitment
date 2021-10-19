package com.yun.controller;

import com.yun.service.business.JobDesService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
@Api(value = "提供职位详情的接口", tags = "职位详情管理")
@CrossOrigin
public class JobDesController {

    @Autowired
    JobDesService jobDesService;

    @GetMapping("/job_des/{jobId}")
    @ApiOperation("查询职位详情的接口(新)")
    public ResultVo showJobDes(@PathVariable("jobId") int jobId) {
        return jobDesService.showJobDesInfor(jobId);
    }
}
