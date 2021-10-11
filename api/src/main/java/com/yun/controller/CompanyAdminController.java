package com.yun.controller;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.service.business.CompanyAdminService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companyAdmin")
@Api(value = "提供公司招聘者登录与注册的接口", tags = "招聘者管理")
@CrossOrigin
public class CompanyAdminController {
    @Autowired
    CompanyAdminService companyAdminService;

    @ApiOperation("公司招聘者登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "email", value = "公司招聘者邮箱"),
            @ApiImplicitParam(dataType = "String", name = "password", value = "公司招聘者登录密码")
    })
    @GetMapping("/login")
    public ResultVo login(@RequestParam("email") String email,
                          @RequestParam("password") String password) {
        ResultVo resultVo = companyAdminService.CompanyAdminLogin(email, password);
        return resultVo;
    }

    @ApiOperation("公司招聘者注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "name", value = "公司招聘者注册昵称"),
            @ApiImplicitParam(dataType = "String", name = "email", value = "公司招聘者注册邮箱"),
            @ApiImplicitParam(dataType = "String", name = "password", value = "公司招聘者注册密码")
    })
    @PostMapping("/register")
    public ResultVo register(@RequestBody CompanyAdmin company
//            @RequestParam("name") String name,
//            @RequestParam("email") String email,
//            @RequestParam("password") String password
    ) {
        ResultVo resultVo = companyAdminService.CompanyAdminRegister(company.getCompanyAdminEmail(), company.getCompanyAdminPassword(), company.getCompanyAdminName());
//        ResultVo resultVo = companyAdminService.CompanyAdminRegister(email, password, name);
        return resultVo;
    }
}
