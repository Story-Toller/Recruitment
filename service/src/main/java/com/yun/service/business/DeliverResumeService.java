package com.yun.service.business;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.sysytem.vo.ResultVo;
import org.apache.ibatis.annotations.Param;

public interface DeliverResumeService {
    //    简历投递信息
    ResultVo deliverResume(Integer custId, Integer jobId, Integer resumeId);

    //    展示投递过的岗位
    ResultVo showDeliverResume(Integer custId,int pageNum, int limit);
}
