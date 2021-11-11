package com.yun.controller;

import com.yun.service.business.IndexJobService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/index_number")
@Api(value = "某些数量统计", tags = "统计管理")
@CrossOrigin
public class IndexNumberController {

    @Autowired
    IndexJobService indexJobService;

    @GetMapping("/com_num")
    @ApiOperation("入驻公司数量")
    public ResultVo joinCompany(){
        ResultVo resultVo = indexJobService.companyNumber();
        return resultVo;
    }

    @GetMapping("/job_num")
    @ApiOperation("职位信息统计")
    public ResultVo joinJob(){
        ResultVo resultVo = indexJobService.jobNumber();
        return resultVo;
    }

    @GetMapping("/dev_num")
    @ApiOperation("投递成功记录统计")
    public ResultVo deliver(){
        ResultVo resultVo = indexJobService.deliverNumber();
        return resultVo;
    }

    @GetMapping("/use_num")
    @ApiOperation("用户统计")
    public ResultVo joinUser(){
        ResultVo resultVo = indexJobService.customerNumber();
        return resultVo;
    }
}

