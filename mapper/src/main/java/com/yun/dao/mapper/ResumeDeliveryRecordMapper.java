package com.yun.dao.mapper;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.beans.vo.DeliverJobVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeDeliveryRecordMapper extends FamilyMapper<ResumeDeliveryRecord> {

    //    我的界面展示投递岗位
    List<DeliverJobVo> showDeliverJob(Integer custId);
}