package com.yun.controller;


import com.yun.beans.entity.CustomerCollection;
import com.yun.service.business.Collectionservice;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/collection")
@Api(value = "提供职位收藏的接口", tags = "职位收藏管理")
@CrossOrigin
public class CollectionController {

    @Autowired
    Collectionservice collectionservice;

    @PostMapping("/col_job")
    @ApiOperation("收藏职位的接口")
    public ResultVo addCollectionJob(@RequestBody CustomerCollection customerCollection, @RequestHeader("token") String token) {
        ResultVo resultVo = collectionservice.collection(customerCollection.getCustId(), customerCollection.getJobId());
        return resultVo;
    }

    @GetMapping("/showcol")
    @ApiOperation("展示职位收藏列表的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "custId", value = "职位收藏者ID", required = true),
            @ApiImplicitParam(dataType = "String", name = "pageNum", value = "页码", required = true),
            @ApiImplicitParam(dataType = "String", name = "limit", value = "每页数量", required = true)
    })
    public ResultVo showCollectionById(Integer custId, int pageNum, int limit, @RequestHeader("token") String token) {
        ResultVo resultVo = collectionservice.showCollectionByCusId(custId, pageNum, limit);
        return resultVo;
    }
}
