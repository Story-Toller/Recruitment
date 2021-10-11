package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface CompanyAdminService {
    //    企业管理员（HR）注册
    ResultVo CompanyAdminRegister(String email, String password, String name);

    //    企业管理员(HR)登录
    ResultVo CompanyAdminLogin(String email,String password);
}
