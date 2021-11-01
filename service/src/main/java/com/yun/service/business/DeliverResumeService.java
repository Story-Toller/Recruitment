package com.yun.service.business;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.sysytem.vo.ResultVo;

public interface DeliverResumeService {
    //    简历投递信息
    ResultVo deliverResume(ResumeDeliveryRecord resumeDeliveryRecord);

    //    展示投递过的岗位
    ResultVo showDeliverResume(Integer custId);
}
