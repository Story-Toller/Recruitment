package com.yun.dao.mapper;

import com.yun.beans.entity.Job;
import com.yun.beans.entity.JobVo;
import com.yun.beans.vo.JobDesVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobMapper extends FamilyMapper<Job> {
    //      首页展示最新发布职业
    List<JobVo> indexShowJob();

    //    首页展示全职工作
    List<JobVo> indexFullJob();

    //    首页展示兼职工作
    List<JobVo> indexPartJob();

    //        技术类职位展示
    List<JobVo> showTechnicalJob();

    //        行政类职位展示
    List<JobVo> showAdministrativeJob();

    //        设计类职位展示
    List<JobVo> showDesignJob();

    //        金融类职位展示
    List<JobVo> showMoneyJob();

    //        销售类职位展示
    List<JobVo> showSaleJob();

    //        教育类职位展示
    List<JobVo> showEducationJob();

    //        医疗类职位展示
    List<JobVo> showHealthyJob();

    //        运营类职位展示
    List<JobVo> showDealJob();

//    职位详情显示
    List<JobDesVo> showJobDes(int jobId);
}