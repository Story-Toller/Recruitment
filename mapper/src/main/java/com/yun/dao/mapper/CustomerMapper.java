package com.yun.dao.mapper;

import com.yun.beans.entity.Customer;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CustomerMapper extends FamilyMapper<Customer> {
    //    修改昵称
    int updateBashInfroByCusId(@Param("custId") Integer custId, @Param("custName") String custName);

    //修改手机号
    int updatePhone(@Param("custId") Integer custId, @Param("custTelno") String custTelno);

    //    修改邮箱
    int updateEmail(@Param("custId") Integer custId, @Param("custEmail") String custEmail);

    //    修改性别
    int updateSex(@Param("custId") Integer custId, @Param("other2") String other2);

    //    修改密码
    int updatePassword(@Param("custId") Integer custId, @Param("custPassword") String custPassword);

    //设置用户资料可见
    int DataIsVisible(Integer custId);

    //设置用户资料不可见
    int DataIsNotVisible(Integer custId);
}