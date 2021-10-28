package com.yun.service.impl;


import com.yun.beans.entity.*;
import com.yun.dao.mapper.*;
import com.yun.service.business.ShowResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class ShowResumeServiceImpl implements ShowResumeService {

    @Autowired
    ResumeMapper resumeMapper;
    @Autowired
    HonorMapper honorMapper;
    @Autowired
    SkillMapper skillMapper;
    @Autowired
    WorkExperienceMapper workExperienceMapper;
    @Autowired
    ProjectExperienceMapper projectExperienceMapper;


    @Override
    public ResultVo showResume(int resumeId) {
        Resume resume = resumeMapper.selectByPrimaryKey(resumeId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", resume);
        return resultVo;
    }

    @Override
    public ResultVo showHonor(Integer resumeId) {
        Example example = new Example(Honor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",resumeId);
        List<Honor> honors = honorMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", honors);
        return resultVo;
    }

    @Override
    public ResultVo showSkill(Integer resumeId) {
        Example example = new Example(Honor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",resumeId);
        List<Skill> skills = skillMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", skills);
        return resultVo;
    }

    @Override
    public ResultVo showWorkExpri(Integer resumeId) {
        Example example = new Example(Honor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",resumeId);
        List<WorkExperience> workExperiences = workExperienceMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", workExperiences);
        return resultVo;
    }

    @Override
    public ResultVo showProject(Integer resumeId) {
        Example example = new Example(Honor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",resumeId);
        List<ProjectExperience> projectExperiences = projectExperienceMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", projectExperiences);
        return resultVo;
    }
}
