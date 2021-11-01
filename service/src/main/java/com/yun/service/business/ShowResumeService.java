package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface ShowResumeService {
//    凭借resumeId展示简历
    ResultVo showResume(int resumeId);
    ResultVo showHonor(Integer resumeId);
    ResultVo showSkill(Integer resumeId);
    ResultVo showWorkExpri(Integer resumeId);
    ResultVo showProject(Integer resumeId);
    ResultVo showEducation(Integer resumeId);

}
