package com.yun.service.impl;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.beans.vo.DeliverJobVo;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.dao.mapper.ResumeDeliveryRecordMapper;
import com.yun.service.business.DeliverResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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
    @Autowired(required = false)
    private JavaMailSender javaMailSender;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Autowired
    JobMapper jobMapper;

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
//                    发送通知邮件
                    String from = "1269355513@qq.com";
                    SimpleMailMessage mailMessage = new SimpleMailMessage();
                    mailMessage.setFrom(from);//发起者
                    String email2 = jobMapper.selectAdminEmail(jobId);
//                    职位名称
                    String jobname = jobMapper.selectJobName(jobId);
                    mailMessage.setTo(email2);//接受者
//                    发送成功提示
                    mailMessage.setSubject("新投递信息");
//                    投递人昵称
                    String name = customerMapper.selectName(custId);
//                    投递人邮箱
                    String email = customerMapper.selectEmail(custId);
                    mailMessage.setText("用户 " + name + " 向你发布的 " + jobname + " 职位投递了简历，请上线查看，他的邮箱是" + email);
                    try {
                        javaMailSender.send(mailMessage);
                        System.out.println("发送简单邮件");
                    } catch (Exception e) {
                        System.out.println("发送简单邮件失败");
                    }
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
