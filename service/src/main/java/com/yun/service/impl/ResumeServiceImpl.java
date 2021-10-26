package com.yun.service.impl;

import com.yun.beans.entity.*;
import com.yun.dao.mapper.*;
import com.yun.service.business.ResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    ResumeMapper resumeMapper;

    @Autowired
    SkillMapper skillMapper;

    @Autowired
    HonorMapper honorMapper;

    @Autowired
    ProjectExperienceMapper projectExperienceMapper;

    @Autowired
    WorkExperienceMapper workExperienceMapper;


    @Override
    public ResultVo bashInforInsert(Integer custId, String resumeName, String reusmeRealName,
                                    String resumeBirth, String resumeTelno, String resumeEmail, String resumeGender,
                                    String resumeLeavingWorking, String resumeLiveCity, String resumePersonid,String resumeIncome,
                                    String resumeFullPartTime) {
        Resume resume = new Resume();
        resume.setCustId(custId);
        resume.setReusmeRealName(reusmeRealName);
        resume.setResumeCreateTime(new Date());
        resume.setResumeBirth(resumeBirth);
        resume.setResumeTelno(resumeTelno);
        resume.setResumeEmail(resumeEmail);
        resume.setResumeGender(resumeGender);
        resume.setResumeLeavingWorking(resumeLeavingWorking);
        resume.setResumeLiveCity(resumeLiveCity);
        resume.setResumeIncome(resumeIncome);
        resume.setResumeName(resumeName);
        resume.setResumePersonid(resumePersonid);
        resume.setResumeFullPartTime(resumeFullPartTime);
        int insert = resumeMapper.insert(resume);
        ResultVo resultVo1 = new ResultVo(ResStatus.OK, "success", insert);
        return resultVo1;
    }

    @Override
    public ResultVo honorInsert(Integer resumeId, String honorCreateTime, String honorName, String honorGrade) {
        Honor honor = new Honor();
        honor.setResumeId(resumeId);
        honor.setHonorCreateTime(honorCreateTime);
        honor.setHonorName(honorName);
        honor.setHonorGrade(honorGrade);
        int insert = honorMapper.insert(honor);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", insert);
        return resultVo;
    }

    @Override
    public ResultVo projectExpInsert(Integer resumeId, String projectCompanyName, String projectStartTime,
                                     String projectEndTime, String projectName,
                                     String projectContentDesc, String projectDutyDesc) {
        ProjectExperience projectExperience = new ProjectExperience();
        projectExperience.setResumeId(resumeId);
        projectExperience.setProjectCompanyName(projectCompanyName);
        projectExperience.setProjectStartTime(projectStartTime);
        projectExperience.setProjectEndTime(projectEndTime);
        projectExperience.setProjectName(projectName);
        projectExperience.setProjectContentDesc(projectContentDesc);
        projectExperience.setProjectDutyDesc(projectDutyDesc);
        int insert = projectExperienceMapper.insert(projectExperience);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", insert);
        return resultVo;
    }

    @Override
    public ResultVo workExpInsert(Integer resumeId, String workStartTime,String workEndTime,String workCompanyName,
                                  String workPosition,String workDepartment,String workCompanyScaler,
                                  String workCompanyProperty,String workDesc) {
        WorkExperience workExperience = new WorkExperience();
        workExperience.setResumeId(resumeId);
        workExperience.setWorkStartTime(workStartTime);
        workExperience.setWorkEndTime(workEndTime);
        workExperience.setWorkCompanyName(workCompanyName);
        workExperience.setWorkPosition(workPosition);
        workExperience.setWorkDepartment(workDepartment);
        workExperience.setWorkCompanyScaler(workCompanyScaler);
        workExperience.setWorkCompanyProperty(workCompanyProperty);
        workExperience.setWorkDesc(workDesc);
        int insert = workExperienceMapper.insert(workExperience);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", insert);
        return resultVo;
    }

    @Override
    public ResultVo skillInsert(Integer resumeId, String skillName,String skillDesc) {
        Skill skill = new Skill();
        skill.setResumeId(resumeId);
        skill.setSkillName(skillName);
        skill.setSkillDesc(skillDesc);
        int insert = skillMapper.insert(skill);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", insert);
        return resultVo;
    }
}
