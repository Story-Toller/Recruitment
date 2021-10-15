package com.yun.controller;

import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import io.jsonwebtoken.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
@CrossOrigin
@Api(value = "提供创建简历接口", tags = "简历管理")
public class CreateResumeController {

    @GetMapping("/create")
    @ApiImplicitParam(dataType = "String", name = "token", value = "令牌", required = true)
    public ResultVo ResumeCreate() {

        return new ResultVo(ResStatus.OK, "success", null);

    }
}
