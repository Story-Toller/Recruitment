package com.yun.dao.mapper;

import com.yun.beans.entity.User;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends FamilyMapper<User> {
}