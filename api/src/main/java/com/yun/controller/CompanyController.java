package com.yun.controller;

import com.yun.service.business.CompanyService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
@Api(value = "提供公司详情页服务的接口", tags = "公司详情页管理")
@CrossOrigin
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("/full_infor/{companyId}")
    @ApiOperation("查询公司详情的接口")
    public ResultVo showAllInformation(@PathVariable("companyId") int companyId){
        ResultVo resultVo = companyService.showAllCompanyInfo(companyId);
        return resultVo;
    }

    @GetMapping("/all")
    @ApiOperation("查询所有公司的接口")
    public ResultVo showAll(){
        ResultVo resultVo = companyService.showAllCompany();
        return resultVo;
    }
}
