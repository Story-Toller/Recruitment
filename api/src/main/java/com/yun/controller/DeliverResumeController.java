package com.yun.controller;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.service.business.DeliverResumeService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.*;
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
    public ResultVo DeliverResume(@RequestBody ResumeDeliveryRecord resumeDeliveryRecord, @RequestHeader("token")String token) {
        ResultVo resultVo = deliverResumeService.deliverResume(resumeDeliveryRecord.getCustId(), resumeDeliveryRecord.getJobId(), resumeDeliveryRecord.getResumeId());
        return resultVo;
    }

    @GetMapping("/showAll")
    @ApiOperation("展示投递简历的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "custId", value = "职位收藏者ID", required = true),
            @ApiImplicitParam(dataType = "String", name = "pageNum", value = "页码", required = true),
            @ApiImplicitParam(dataType = "String", name = "limit", value = "每页数量", required = true)
    })
    public ResultVo showDeliverResume(Integer custId, int pageNum, int limit) {
        ResultVo resultVo = deliverResumeService.showDeliverResume(custId,pageNum,limit);
        return resultVo;
    }

}
