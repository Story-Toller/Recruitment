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


    @ApiOperation("用户修改用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "custName", value = "应聘者用户名", required = true),
            @ApiImplicitParam(dataType = "String", name = "custId", value = "应聘者id", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)

    })
    @PutMapping("/updateCusInf/{custId}/{custName}")
    public ResultVo updateCusInfor(@PathVariable("custId") Integer custId, @PathVariable("custName") String custName,
                                   @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.updateBashInfor(custId, custName);
        return resultVo;
    }

    @ApiOperation("用户修改邮箱")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "custEmail", value = "应聘者邮箱", required = true),
            @ApiImplicitParam(dataType = "String", name = "custId", value = "应聘者id", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)

    })
    @PutMapping("/updateEmail/{custId}/{custEmail}")
    public ResultVo updateEmail(@PathVariable("custId") Integer custId, @PathVariable("custEmail") String custEmail,
                                @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.updateEmail(custId, custEmail);
        return resultVo;
    }

    @ApiOperation("用户修改手机号")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "custTelno", value = "应聘者手机号", required = true),
            @ApiImplicitParam(dataType = "String", name = "custId", value = "应聘者id", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)

    })
    @PutMapping("/updatePhone/{custId}/{custTelno}")
    public ResultVo updatePhone(@PathVariable("custId") Integer custId, @PathVariable("custTelno") String custTelno,
                                @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.updatePhone(custId, custTelno);
        return resultVo;
    }

    @ApiOperation("用户修改性别")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "other2", value = "应聘者性别2", required = true),
            @ApiImplicitParam(dataType = "String", name = "custId", value = "应聘者id", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)

    })
    @PutMapping("/updateSex/{custId}/{other2}")
    public ResultVo updateSex(@PathVariable("custId") Integer custId, @PathVariable("other2") String other2,
                              @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.updateSex(custId, other2);
        return resultVo;
    }

    @ApiOperation("设置用户资料可见/0 默认不可见/1 可见")
    @PutMapping("/visible/{custId}")
    public ResultVo DataEvenVisible(@PathVariable("custId") Integer custId, @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.DataIsVisible(custId);
        return resultVo;
    }

    @ApiOperation("设置用户资料不不不可见/0 默认不可见/1 可见")
    @PutMapping("/notVisible/{custId}")
    public ResultVo DataNotVisible(@PathVariable("custId") Integer custId, @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.DataIsNotVisible(custId);
        return resultVo;
    }

    @ApiOperation("更改用户密码")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "custId", value = "应聘者id", required = true),
            @ApiImplicitParam(dataType = "String", name = "custPassword", value = "更改后密码", required = true),
            @ApiImplicitParam(dataType = "String", name = "pwd", value = "原密码", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)

    })
    @PutMapping("/changepwd/{custId}/{custPassword}/{pwd}")
    public ResultVo changePassword(@PathVariable("custId") Integer custId, @PathVariable("custPassword") String custPassword,
                                   @PathVariable("pwd") String pwd, @RequestHeader("token") String token) {
        ResultVo resultVo = customerService.updatePsaaword(custId, custPassword, pwd);
        return resultVo;
    }
}
