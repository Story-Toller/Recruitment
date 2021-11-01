package com.yun.service.impl;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.beans.vo.DeliverJobVo;
import com.yun.dao.mapper.ResumeDeliveryRecordMapper;
import com.yun.service.business.DeliverResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DeliverResumeServiceImpl implements DeliverResumeService {

    @Autowired
    ResumeDeliveryRecordMapper resumeDeliveryRecordMapper;
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public ResultVo deliverResume(ResumeDeliveryRecord resumeDeliveryRecord) {
        resumeDeliveryRecord.setDeliveryTime(s.format(new Date()));
        int insert = resumeDeliveryRecordMapper.insert(resumeDeliveryRecord);
        if (insert>0){
            return new ResultVo(ResStatus.OK,"success",null);
        }else {
            return new ResultVo(ResStatus.NO,"failed",null);
        }
    }

    @Override
    public ResultVo showDeliverResume(Integer custId) {
        List<DeliverJobVo> deliverJobVos = resumeDeliveryRecordMapper.showDeliverJob(custId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", deliverJobVos);
        return resultVo;
    }
}
