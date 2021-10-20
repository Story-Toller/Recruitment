package com.yun.dao.mapper;

import com.yun.beans.entity.CustomerCollection;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerCollectionMapper extends FamilyMapper<CustomerCollection> {
}