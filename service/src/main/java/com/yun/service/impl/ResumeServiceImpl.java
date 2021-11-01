package com.yun.service.impl;

import com.yun.beans.entity.*;
import com.yun.dao.mapper.*;
import com.yun.service.business.ResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

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

    @Autowired
    EducationMapper educationMapper;


    @Override
    public ResultVo bashInforInsert(Integer custId, String resumeName, String reusmeRealName,
                                    String resumeBirth, String resumeTelno, String resumeEmail, String resumeGender,
                                    String resumeLeavingWorking, String resumeLiveCity, String resumePersonid, String resumeIncome,
                                    String resumeFullPartTime) {
        Example example = new Example(Resume.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeName", resumeName);
        List<Resume> resumes = resumeMapper.selectByExample(example);
        if (resumes.size() == 0) {
            Resume resume = new Resume();
            resume.setCustId(custId);
            resume.setResumeName(resumeName);
            resume.setReusmeRealName(reusmeRealName);
            resume.setResumeCreateTime(new Date());
            resume.setResumeBirth(resumeBirth);
            resume.setResumeTelno(resumeTelno);
            resume.setResumeEmail(resumeEmail);
            resume.setResumeGender(resumeGender);
            resume.setResumeLeavingWorking(resumeLeavingWorking);
            resume.setResumeLiveCity(resumeLiveCity);
            resume.setResumeIncome(resumeIncome);
            resume.setResumePersonid(resumePersonid);
            resume.setResumeFullPartTime(resumeFullPartTime);
            int insert = resumeMapper.insert(resume);
            ResultVo resultVo1 = new ResultVo(ResStatus.OK, "success", insert);
            return resultVo1;
        } else {
            return new ResultVo(ResStatus.NO, "简历名已被占用", null);
        }
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
    public ResultVo workExpInsert(Integer resumeId, String workStartTime, String workEndTime, String workCompanyName,
                                  String workPosition, String workDepartment, String workCompanyScaler,
                                  String workCompanyProperty, String workDesc) {
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
    public ResultVo skillInsert(Integer resumeId, String skillName, String skillDesc) {
        Skill skill = new Skill();
        skill.setResumeId(resumeId);
        skill.setSkillName(skillName);
        skill.setSkillDesc(skillDesc);
        int insert = skillMapper.insert(skill);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", insert);
        return resultVo;
    }

    @Override
    public ResultVo educationInsert(Integer resumeId, String eduLevel, String eduName, String eduStart, String eduStop, String eduPro) {
        Education education = new Education();
        education.setResumeId(resumeId);
        education.setEduLevel(eduLevel);
        education.setEduName(eduName);
        education.setEduStart(eduStart);
        education.setEduStop(eduStop);
        education.setEduPro(eduPro);
        int insert = educationMapper.insert(education);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", insert);
        return resultVo;
    }


}
