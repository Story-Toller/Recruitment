package com.yun.service.impl;

import com.yun.beans.entity.User;
import com.yun.dao.mapper.UserMapper;
import com.yun.service.business.UserService;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public ResultVo login(String name, String password) {
        User user = userMapper.queryUserByName(name);
        if (user == null) {
            return new ResultVo(1001, "用户名不存在", null);
        } else {
            if (user.getPassword().equals(password)) {
                return new ResultVo(1000, "登陆成功", user);
            }
            return new ResultVo(1000, "密码错误", null);
        }

    }
}
