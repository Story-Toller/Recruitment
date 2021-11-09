package com.yun.controller;


import com.yun.beans.entity.*;
import com.yun.service.business.ResumeService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resume")
@Api(value = "提供简历服务的接口", tags = "简历管理")
@CrossOrigin
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @ApiOperation("添加简历基本信息接口")
    @PostMapping("/bashIns")
    public ResultVo bashInfor(@RequestBody Resume resume, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.bashInforInsert(resume.getCustId(), resume.getResumeName(),
                resume.getReusmeRealName(), resume.getResumeBirth(),
                resume.getResumeTelno(), resume.getResumeEmail(),
                resume.getResumeGender(), resume.getResumeLeavingWorking(),
                resume.getResumeLiveCity(), resume.getResumeIncome(),
                resume.getResumePersonid(), resume.getResumeFullPartTime());
        return resultVo;
    }


    @ApiOperation("添加简历荣誉信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "resumeId", value = "简历id", required = true),
            @ApiImplicitParam(dataType = "String", name = "honorCreateTime", value = "荣誉获取时间", required = true),
            @ApiImplicitParam(dataType = "String", name = "honorName", value = "荣誉名称", required = true),
            @ApiImplicitParam(dataType = "String", name = "honorGrade", value = "荣誉等级", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)
    })
    @PostMapping("/honor")
    public ResultVo honor(@RequestBody Honor honor, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.honorInsert(honor.getResumeId(), honor.getHonorCreateTime(),
                honor.getHonorName(), honor.getHonorGrade());
        return resultVo;
    }


    @ApiOperation("添加简历项目经历接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "resumeId", value = "简历id", required = true),
            @ApiImplicitParam(dataType = "String", name = "projectCompanyName", value = "项目所在公司名", required = true),
            @ApiImplicitParam(dataType = "String", name = "projectStartTime", value = "项目经验开始时间", required = true),
            @ApiImplicitParam(dataType = "String", name = "projectEndTime", value = "项目经验结束时间", required = true),
            @ApiImplicitParam(dataType = "String", name = "projectName", value = "项目名称", required = true),
            @ApiImplicitParam(dataType = "String", name = "projectContentDesc", value = "项目内容描述", required = true),
            @ApiImplicitParam(dataType = "String", name = "projectDutyDesc", value = "项目职责描述", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)
    })
    @PostMapping("/project")
    public ResultVo projectExp(@RequestBody ProjectExperience projectExperience, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.projectExpInsert(projectExperience.getResumeId(), projectExperience.getProjectName(),
                projectExperience.getProjectStartTime(), projectExperience.getProjectEndTime(),
                projectExperience.getProjectCompanyName(), projectExperience.getProjectContentDesc(),
                projectExperience.getProjectDutyDesc());
        return resultVo;
    }

    @ApiOperation("添加简历工作经验接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "resumeId", value = "简历id", required = true),
            @ApiImplicitParam(dataType = "String", name = "workStartTime", value = "工作经验开始时间", required = true),
            @ApiImplicitParam(dataType = "String", name = "workEndTime", value = "工作经验结束时间", required = true),
            @ApiImplicitParam(dataType = "String", name = "workCompanyName", value = "所在公司名", required = true),
            @ApiImplicitParam(dataType = "String", name = "workPosition", value = "工作职位", required = true),
            @ApiImplicitParam(dataType = "String", name = "workDepartment", value = "工作所在部门", required = true),
            @ApiImplicitParam(dataType = "String", name = "workCompanyScaler", value = "公司规模", required = true),
            @ApiImplicitParam(dataType = "String", name = "workCompanyProperty", value = "公司性质", required = true),
            @ApiImplicitParam(dataType = "String", name = "workDesc", value = "工作描述", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)
    })
    @PostMapping("/work")
    public ResultVo workExpInsert(@RequestBody WorkExperience workExperience, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.workExpInsert(workExperience.getResumeId(), workExperience.getWorkStartTime(), workExperience.getWorkEndTime(),
                workExperience.getWorkCompanyName(), workExperience.getWorkPosition(), workExperience.getWorkDepartment(),
                workExperience.getWorkCompanyScaler(), workExperience.getWorkCompanyProperty(), workExperience.getWorkDesc());
        return resultVo;
    }


    @ApiOperation("添加简历技能接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "resumeId", value = "简历id", required = true),
            @ApiImplicitParam(dataType = "String", name = "skillName", value = "技能名称", required = true),
            @ApiImplicitParam(dataType = "String", name = "skillDesc", value = "技能描述", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)
    })
    @PostMapping("/skill")
    public ResultVo skillInsert(@RequestBody Skill skill, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.skillInsert(skill.getResumeId(), skill.getSkillName(), skill.getSkillDesc());
        return resultVo;
    }


    @ApiOperation("添加简历学历接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "resumeId", value = "简历id", required = true),
            @ApiImplicitParam(dataType = "String", name = "eduLevel", value = "学历等级", required = true),
            @ApiImplicitParam(dataType = "String", name = "eduName", value = "学校名称", required = true),
            @ApiImplicitParam(dataType = "String", name = "eduStart", value = "入学时间", required = true),
            @ApiImplicitParam(dataType = "String", name = "eduStop", value = "毕业时间", required = true),
            @ApiImplicitParam(dataType = "String", name = "eduPro", value = "专业", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)
    })
    @PostMapping("/educate")
    public ResultVo educationInsert(@RequestBody Education education, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.educationInsert(education.getResumeId(),
                education.getEduLevel(), education.getEduName(), education.getEduStart(), education.getEduStop(),
                education.getEduPro());
        return resultVo;
    }

    @ApiOperation("设置简历不可见")
    @PostMapping("/notVisible")
    public ResultVo ResumeNotVisible(Integer resumeId, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.ResumeNotVisible(resumeId);
        return resultVo;
    }


    @ApiOperation("设置简历可见")
    @PostMapping("/visible")
    public ResultVo ResumeVisible(Integer resumeId, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.ResumeVisible(resumeId);
        return resultVo;
    }

    @ApiOperation("页面详情页显示拥有简历")
    @GetMapping("/showAllRes")
    public ResultVo ShowAllRes(Integer custId, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.showAllYouResume(custId);
        return resultVo;
    }
}
