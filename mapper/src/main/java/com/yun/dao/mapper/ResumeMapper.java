package com.yun.dao.mapper;

import com.yun.beans.entity.Resume;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper extends FamilyMapper<Resume> {
    //    设置用户简历可见
    int ResumeVisible(Integer resumeId);

    //    设置用户简历不不不可见
    int ResumeNotVisible(Integer resumeId);

    //    页面详情页显示拥有简历
    List<Resume> showAllResumeHave(Integer custId);

    //    查询可见简历的数量
    int selectNumberOfCanSeeResume(Integer custId);

    //    由简历id查询用户id
    int selectCustomerIdByResumeId(Integer resumeId);
}