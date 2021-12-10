package com.yun.dao.mapper;

import com.yun.beans.entity.SysUser;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends FamilyMapper<SysUser> {
}