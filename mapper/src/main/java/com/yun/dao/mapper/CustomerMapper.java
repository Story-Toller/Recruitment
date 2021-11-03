package com.yun.dao.mapper;

import com.yun.beans.entity.Customer;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CustomerMapper extends FamilyMapper<Customer> {
    int updateBashInfroByCusId(@Param("cusId") int cusId, @Param("cusName") String cusName,
                               @Param("cusPhone") String cusPhone, @Param("cusEmail") String cusEmail,
                               @Param("other2") String other2);
//设置用户资料可见
    int DataIsVisible (Integer custId);
    //设置用户资料不可见
    int DataIsNotVisible (Integer custId);
}