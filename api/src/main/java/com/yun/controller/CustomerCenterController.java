package com.yun.controller;

import com.yun.beans.entity.Customer;
import com.yun.service.business.CustomerCenterService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customerCenter")
@Api(value = "提供应聘者中心相关服务的接口", tags = "应聘者中心管理")
@CrossOrigin
public class CustomerCenterController {

    @Autowired
    CustomerCenterService customerCenterService;

    @GetMapping("/bashInfor")
    @ApiOperation("查询基本信息的接口")
    public ResultVo InformationList(Integer custId, @RequestHeader("token") String token) {
        ResultVo resultVo = customerCenterService.customerInformationList(custId);
        return resultVo;
    }

    @GetMapping("/resumeList")
    @ApiOperation("查询简历列表的接口")
    public ResultVo ResumeList(Integer custId, @RequestHeader("token") String token) {
        ResultVo resultVo = customerCenterService.customerResumeList(custId);
        return resultVo;
    }
}
