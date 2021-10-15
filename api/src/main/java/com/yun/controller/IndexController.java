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
@RequestMapping("/index")
@Api(value = "提供首页服务的接口", tags = "首页管理")
@CrossOrigin
public class IndexController {

    @Autowired
    IndexJobService indexJobService;

    @GetMapping("/new-job")
    @ApiOperation("查询最新职位的接口")
    public ResultVo showHotJob(){
        ResultVo resultVo = indexJobService.showHotJob();
        return resultVo;

    }

}
