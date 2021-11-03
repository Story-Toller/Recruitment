package com.yun;

import com.yun.beans.entity.Company;
import com.yun.beans.entity.CustomerCollection;
import com.yun.beans.entity.JobVo;
import com.yun.beans.vo.DeliverJobVo;
import com.yun.beans.vo.JobCollectionVo;
import com.yun.beans.vo.JobDesVo;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.dao.mapper.CustomerCollectionMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.dao.mapper.ResumeDeliveryRecordMapper;
import com.yun.service.business.ResumeService;
import com.yun.sysytem.vo.ResultVo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootTest
@MapperScan("com.yun.dao.mapper")
class ApiApplicationTests {

    @Autowired
    JobMapper jobMapper;
    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    CustomerCollectionMapper customerCollectionMapper;
    @Autowired
    ResumeService resumeService;
    @Autowired
    ResumeDeliveryRecordMapper resumeDeliveryRecordMapper;


    @Test
    void contextLoads() {

        List<JobVo> showjobs = jobMapper.indexShowJob();
        for (JobVo j : showjobs) {
            System.out.println(j);
        }

    }

    @Test
    void contextLoads1() {

        List<JobVo> showjobs = jobMapper.indexFullJob();
        for (JobVo j : showjobs) {
            System.out.println(j);
        }

    }

    @Test
    void contextLoads2() {

        List<JobVo> showjobs = jobMapper.indexPartJob();
        for (JobVo j : showjobs) {
            System.out.println(j);
        }

    }

    @Test
    void contextLoads3() {

        List<JobVo> showjobs = jobMapper.showTechnicalJob();
        for (JobVo j : showjobs) {
            System.out.println(j);
        }

    }

    @Test
    void contextLoads4() {

        List<JobVo> showjobs = jobMapper.showAdministrativeJob();
        for (JobVo j : showjobs) {
            System.out.println(j);
        }
    }

    @Test
    void contextLoads5() {

        List<JobVo> showjobs = jobMapper.showDealJob();
        for (JobVo j : showjobs) {
            System.out.println(j);
        }
    }

    @Test
    void contextLoads6() {

        List<JobVo> showjobs = jobMapper.showSaleJob();
        for (JobVo j : showjobs) {
            System.out.println(j);
        }
    }

    @Test
    void contextLoads7() {
        List<JobDesVo> jobDesVos = jobMapper.showJobDes(5);
        for (JobDesVo p : jobDesVos) {
            System.out.println(p);
        }
    }

    @Test
    void contextLoads8() {
        List<Company> companies = companyMapper.showAllCompanyInfo(2);
        for (Company p : companies) {
            System.out.println(p);
        }
    }

    @Test
    void contextLoads9() {
        List<JobCollectionVo> jobCollectionVos = customerCollectionMapper.showJobCollection(24);
        for (JobCollectionVo p : jobCollectionVos) {
            System.out.println(p);
        }
    }

    @Test
    void contextLoads10() {
        Integer id = 18;
        String time = "2017-9-8";
        String gra = "第一名";
        String na = "吹牛逼大师赛";
//        resumeService.honorInsert()
    }

    @Test
    void contextLoads11() {
        Integer id = 26;
        List<DeliverJobVo> deliverJobVos = resumeDeliveryRecordMapper.showDeliverJob(id);
        System.out.println(deliverJobVos);
//        resumeService.honorInsert()
    }
}


