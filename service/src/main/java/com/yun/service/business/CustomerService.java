package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;


public interface CustomerService {

//    用户注册
    ResultVo customerResgit(String email,String password,String name);

//    用户登录
    ResultVo checkLogin(String email,String password);

}
