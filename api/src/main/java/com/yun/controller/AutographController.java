package com.yun.controller;

import com.yun.service.business.AutographService;
import com.yun.service.impl.AutographServiceImpl;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Autograph")
@Api(value = "提供修改签名的接口", tags = "签名管理")
@CrossOrigin
public class AutographController {

    @Autowired
    AutographServiceImpl autographService;
    @Autowired
    AutographService autographServices;

    @PutMapping("/change")
    @ApiOperation("更改签名的接口")
    public ResultVo showAllInformation(Integer custId,String custAutograph){
        ResultVo chenge = autographService.chenge(custId, custAutograph);
        return chenge;
    }

    @GetMapping("/show")
    @ApiOperation("展示签名的接口")
    public ResultVo show(Integer custId){
        ResultVo resultVo = autographServices.showAutograph(custId);
        return resultVo;
    }
}
