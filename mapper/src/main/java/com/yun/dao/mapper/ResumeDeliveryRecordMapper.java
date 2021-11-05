package com.yun.dao.mapper;

import com.yun.beans.entity.Resume;
import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.beans.vo.DeliverJobVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ResumeDeliveryRecordMapper extends FamilyMapper<ResumeDeliveryRecord> {

    //    我的界面展示投递岗位
    List<DeliverJobVo> showDeliverJob(Integer custId);

    //    投递职位防止重复
    List<ResumeDeliveryRecord> PreventDuplication(@Param("custId") Integer custId, @Param("jobId") Integer jobId, @Param("resumeId") Integer resumeId);
}