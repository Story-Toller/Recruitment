package com.yun.dao.mapper;

import com.yun.beans.entity.Resume;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResumeMapper extends FamilyMapper<Resume> {
    //    设置用户简历可见
    int ResumeVisible(Integer resumeId);

    //    设置用户简历不不不可见
    int ResumeNotVisible(Integer resumeId);
}