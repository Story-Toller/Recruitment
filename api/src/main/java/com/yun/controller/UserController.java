package com.yun.controller;

import com.yun.service.business.UserService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户管理", tags = "实现用户注册 ")
public class UserController {

    @Autowired(required = false)

    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiOperation("hello接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "账号", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "密码", required = false)
    })
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation("登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "账号", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "密码", required = false)
    })
    public ResultVo login(String name, String password) {
        return userService.login(name, password);

    }
}
