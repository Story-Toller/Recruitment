package com.yun.controller;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.service.business.DeliverResumeService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliver")
@Api(value = "提供投递简历的接口", tags = "简历投递管理")
@CrossOrigin
public class DeliverResumeController {

    @Autowired
    DeliverResumeService deliverResumeService;

    @PostMapping("/resume")
    @ApiOperation("投递简历的接口")
    public ResultVo DeliverResume(@RequestBody ResumeDeliveryRecord resumeDeliveryRecord){
        ResultVo resultVo = deliverResumeService.deliverResume(resumeDeliveryRecord);
        return resultVo;
    }

    @GetMapping("/showAll")
    @ApiOperation("展示投递简历的接口")
    @ApiImplicitParam(dataType = "Integer", name = "custId", value = "职位收藏者ID", required = true)
    public ResultVo showDeliverResume(Integer custId){
        ResultVo resultVo = deliverResumeService.showDeliverResume(custId);
        return resultVo;
    }

}
