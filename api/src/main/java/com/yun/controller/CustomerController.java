package com.yun.controller;

import com.yun.beans.entity.Customer;
import com.yun.service.business.CustomerService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Api(value = "提供应聘者的登录和注册接口", tags = "应聘者管理")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @ApiOperation("应聘者登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "email", value = "应聘者登录邮箱", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "应聘者登录密码", required = true)
    })
    @GetMapping("/login")
    public ResultVo login(@RequestParam("email") String email,
                          @RequestParam(value = "password") String password) {
        ResultVo resultVo = customerService.checkLogin(email, password);
        return resultVo;
    }

    @ApiOperation("应聘者注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "email", value = "应聘者注册邮箱", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "应聘者注册密码", required = true),
            @ApiImplicitParam(dataType = "String", name = "name", value = "应聘者注册用户名", required = true)
    })
    @PostMapping("/regiest")
    public ResultVo regiest(@RequestBody Customer customer) {
        ResultVo resultVo = customerService.customerResgit(customer.getCustEmail(), customer.getCustPassword(), customer.getCustName());
        return resultVo;
    }


    @ApiOperation("用户修改基本信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "cusEmail", value = "应聘者邮箱", required = true),
            @ApiImplicitParam(dataType = "String", name = "cusPhone", value = "应聘者手机号", required = true),
            @ApiImplicitParam(dataType = "String", name = "cusName", value = "应聘者用户名", required = true),
            @ApiImplicitParam(dataType = "String", name = "other2", value = "应聘者性别", required = true),
            @ApiImplicitParam(dataType = "String", name = "cusId", value = "应聘者id", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)

    })
    @PutMapping("/updateCusInf/{cusId}/{cusName}/{cusPhone}/{cusEmail}/{other2}")
    public ResultVo updateCusInfor(@PathVariable("cusId") int cusId, @PathVariable("cusName") String cusName,
                                   @PathVariable("cusPhone") String cusPhone, @PathVariable("cusEmail") String cusEmail,
                                   @PathVariable("other2") String other2, @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.updateBashInfor(cusId, cusName, cusPhone, cusEmail, other2);
        return resultVo;
    }

}
