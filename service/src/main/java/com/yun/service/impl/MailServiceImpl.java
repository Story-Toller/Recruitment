package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.service.business.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MailServiceImpl implements MailService {
    @Autowired(required = false)
    private JavaMailSender javaMailSender;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Autowired
    JobMapper jobMapper;


    public void sendMail(Integer custId,Integer jobId) {
        String from="1269355513@qq.com";
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom(from);//发起者
        String email2 = jobMapper.selectAdminEmail(jobId);
        String jobname = jobMapper.selectJobName(jobId);
        mailMessage.setTo(email2);//接受者
        mailMessage.setSubject("新投递信息");
        String name = customerMapper.selectName(custId);
        String email = customerMapper.selectEmail(custId);
        mailMessage.setText("用户 "+name+" 向你发布的 "+jobname+" 职位投递了简历，请上线查看，他的邮箱是"+email);
        try {
            javaMailSender.send(mailMessage);
            System.out.println("发送简单邮件");
        }catch (Exception e){
            System.out.println("发送简单邮件失败");
        }
    }
}
