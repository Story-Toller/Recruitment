package com.yun.controller;


import com.yun.beans.entity.CustomerCollection;
import com.yun.service.business.Collectionservice;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
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

    @PostMapping("/col_job")    @ApiOperation("收藏职位的接口")
    public ResultVo addCollectionJob(@RequestBody CustomerCollection customerCollection, @RequestHeader("token") String token){
        ResultVo resultVo = collectionservice.addCollection(customerCollection);
        return resultVo;
    }

}
