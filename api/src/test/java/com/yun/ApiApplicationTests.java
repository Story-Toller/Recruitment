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
    }


