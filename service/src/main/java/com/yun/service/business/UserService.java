package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface UserService {
    ResultVo login(String name, String password);
}
