package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;
import org.apache.ibatis.annotations.Param;


public interface CustomerService {

    //    用户注册
    ResultVo customerResgit(String email, String password, String name);

    //    用户登录
    ResultVo checkLogin(String email, String password);

    //修改用户名
    ResultVo updateBashInfor(Integer custId, String custName);

    //修改手机号
    ResultVo updatePhone(Integer custId, String custTelno);

    //修改邮箱
    ResultVo updateEmail(Integer custId, String custEmail);

    //修改性别
    ResultVo updateSex(Integer custId, String other2);

    //设置用户资料可见
    ResultVo DataIsVisible(Integer custId);

    //设置用户资料不可见
    ResultVo DataIsNotVisible(Integer custId);
}
