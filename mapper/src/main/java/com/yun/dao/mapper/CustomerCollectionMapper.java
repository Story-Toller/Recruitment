package com.yun.dao.mapper;

import com.yun.beans.entity.CustomerCollection;
import com.yun.beans.vo.JobCollectionVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CustomerCollectionMapper extends FamilyMapper<CustomerCollection> {

    //    收藏职位显示
    List<JobCollectionVo> showJobCollection(Integer custId);

//    收藏职位
    List<CustomerCollection> collection(@Param("custId") Integer custId, @Param("jobId")Integer jobId);
}