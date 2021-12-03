package com.yun.dao.mapper;

import com.yun.beans.entity.Job;
import com.yun.beans.entity.JobCollection;
import com.yun.beans.entity.JobVo;
import com.yun.beans.vo.JobCollectionVo;
import com.yun.beans.vo.JobDesVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobMapper extends FamilyMapper<Job> {
    //      首页展示最新发布职业
    List<JobVo> indexShowJob(@Param("start") int start,
                             @Param("limit") int limit);

    //    首页展示全职工作
    List<JobVo> indexFullJob(@Param("start") int start,
                             @Param("limit") int limit);

    //    首页展示兼职工作
    List<JobVo> indexPartJob(@Param("start") int start,
                             @Param("limit") int limit);

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

    //    职位搜索
    List<JobVo> selectByKeyWord(@Param("keyword") String keyword,
                                @Param("start") int start,
                                @Param("limit") int limit);


    String selectJobName(Integer jobId);
    String selectAdminName(Integer jobId);
    String selectAdminEmail(Integer jobId);

}