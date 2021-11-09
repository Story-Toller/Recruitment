package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;


public interface ResumeService {
    //    基本信息录入
    ResultVo bashInforInsert(Integer custId, String resumeName,
                             String resumeCreateTime, String resumeBirth, String resumeTelno,
                             String resumeEmail, String resumeGender, String resumeLeavingWorking,
                             String resumeLiveCity, String resumePersonid, String resumeIncome,
                             String resumeFullPartTime);

    //    荣誉情况录入
    ResultVo honorInsert(Integer resumeId, String honorCreateTime, String honorName, String honorGrade);

    //    项目经验录入
    ResultVo projectExpInsert(Integer resumeId, String projectCompanyName, String projectStartTime,
                              String projectEndTime, String projectName,
                              String projectContentDesc, String projectDutyDesc);

    //    工作经验录入
    ResultVo workExpInsert(Integer resumeId, String workStartTime, String workEndTime, String workCompanyName,
                           String workPosition, String workDepartment, String workCompanyScaler,
                           String workCompanyProperty, String workDesc);


    //    专业技能录入
    ResultVo skillInsert(Integer resumeId, String skillName, String skillDesc);

    //    学历导入
    ResultVo educationInsert(Integer resumeId, String eduLevel, String eduName, String eduStart, String eduStop, String eduPro);

    //    设置简历可见
    ResultVo ResumeVisible(Integer resmeId);

    //    设置简历不可见
    ResultVo ResumeNotVisible(Integer resumeId);

    //    页面详情页显示拥有简历
    ResultVo showAllYouResume(Integer custId);
}
