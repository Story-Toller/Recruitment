package com.yun;

import com.yun.beans.entity.JobVo;
import com.yun.dao.mapper.JobMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.yun.dao.mapper")
class ApiApplicationTests {

    @Autowired
    JobMapper jobMapper;


    @Test
    void contextLoads() {

        List<JobVo> showjobs = jobMapper.indexShowJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }

    }
    @Test
    void contextLoads1() {

        List<JobVo> showjobs = jobMapper.indexFullJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }

    }
    @Test
    void contextLoads2() {

        List<JobVo> showjobs = jobMapper.indexPartJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }

    }
    @Test
    void contextLoads3() {

        List<JobVo> showjobs = jobMapper.showTechnicalJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }

    }
    @Test
    void contextLoads4() {

        List<JobVo> showjobs = jobMapper.showAdministrativeJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }
    }
    @Test
    void contextLoads5() {

        List<JobVo> showjobs = jobMapper.showDealJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }
    }@Test
    void contextLoads6() {

        List<JobVo> showjobs = jobMapper.showSaleJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }
    }@Test
    void contextLoads7() {

        List<JobVo> showjobs = jobMapper.showMoneyJob();
        for (JobVo j:showjobs){
            System.out.println(j);
        }
    }



    }


