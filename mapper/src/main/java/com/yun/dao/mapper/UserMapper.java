package com.yun.dao.mapper;

import com.yun.beans.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryUserByName(String name);
}
