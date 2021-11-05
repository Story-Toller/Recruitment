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
    public ResultVo deliverResume(Integer custId, Integer jobId, Integer resumeId) {
        List<ResumeDeliveryRecord> resumeDeliveryRecords = resumeDeliveryRecordMapper.PreventDuplication(custId, jobId, resumeId);
        if (custId == null) {
            ResultVo resultVo = new ResultVo(ResStatus.LOGIN_TIMEOUT, "请先登录吧", null);
            return resultVo;
        } else {
            if (resumeId == null) {
                ResultVo resultVo = new ResultVo(ResStatus.WITHOUTRESUME, "请先选择简历", null);
                return resultVo;
            } else {
                if (resumeDeliveryRecords.size() == 0) {
                    ResumeDeliveryRecord resumeDeliveryRecord = new ResumeDeliveryRecord();
                    resumeDeliveryRecord.setCustId(custId);
                    resumeDeliveryRecord.setResumeId(resumeId);
                    resumeDeliveryRecord.setJobId(jobId);
                    resumeDeliveryRecord.setDeliveryTime(s.format(new Date()));
                    int insert = resumeDeliveryRecordMapper.insert(resumeDeliveryRecord);
                    ResultVo resultVo = new ResultVo(ResStatus.OK, "投递成功", insert);
                    return resultVo;
                } else {
                    ResultVo resultVo = new ResultVo(ResStatus.NO, "请勿重复投递", null);
                    return resultVo;
                }
            }
        }

    }

    @Override
    public ResultVo showDeliverResume(Integer custId) {
        List<DeliverJobVo> deliverJobVos = resumeDeliveryRecordMapper.showDeliverJob(custId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", deliverJobVos);
        return resultVo;
    }
}
