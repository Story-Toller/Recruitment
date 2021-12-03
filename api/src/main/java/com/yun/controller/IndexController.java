package com.yun.controller;

import com.yun.service.business.IndexJobService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "pageNum", value = "页码", required = true),
            @ApiImplicitParam(dataType = "String", name = "limit", value = "每页数量", required = true)
    })
    public ResultVo showHotJob(int pageNum, int limit){
        ResultVo resultVo = indexJobService.showHotJob(pageNum, limit);
        return resultVo;
    }

    @GetMapping("/full-job")
    @ApiOperation("查询全职的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "pageNum", value = "页码", required = true),
            @ApiImplicitParam(dataType = "String", name = "limit", value = "每页数量", required = true)
    })
    public ResultVo showFullJob(int pageNum, int limit){
        ResultVo resultVo = indexJobService.indexFullJob(pageNum, limit);
        return resultVo;
    }

    @GetMapping("/part-job")
    @ApiOperation("查询兼职的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "pageNum", value = "页码", required = true),
            @ApiImplicitParam(dataType = "String", name = "limit", value = "每页数量", required = true)
    })
    public ResultVo showPartJob(int pageNum, int limit){
        ResultVo resultVo = indexJobService.indexPartJob(pageNum, limit);
        return resultVo;
    }
}
