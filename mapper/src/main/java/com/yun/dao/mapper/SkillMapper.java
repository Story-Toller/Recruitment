package com.yun.dao.mapper;

import com.yun.beans.entity.Skill;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SkillMapper extends FamilyMapper<Skill> {
}