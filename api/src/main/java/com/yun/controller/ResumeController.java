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
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "custId", value = "用户id", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeName", value = "简历名称", required = true),
            @ApiImplicitParam(dataType = "String", name = "reusmeRealName", value = "简历中用户名字", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeBirth", value = "简历中用户生日", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeTelno", value = "简历中用户电话", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeEmail", value = "简历中用户邮箱", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeGender", value = "简历中用户性别", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeLeavingWorking", value = "简历中用户职位状态", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeLiveCity", value = "简历中用户居住地", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumePersonid", value = "简历中用户应聘职位", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeIncome", value = "简历中用户期望月收入", required = true),
            @ApiImplicitParam(dataType = "String", name = "resumeFullPartTime", value = "简历中用户应聘职位类别", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true),
    })

    @PostMapping("/crebash")
    public ResultVo bashInfor(@RequestParam("custId") Integer custId, @RequestParam("resumeName") String resumeName,
                              @RequestParam("reusmeRealName") String reusmeRealName, @RequestParam("resumeBirth") String resumeBirth,
                              @RequestParam("resumeTelno") String resumeTelno, @RequestParam("resumeEmail") String resumeEmail,
                              @RequestParam("resumeGender") String resumeGender, @RequestParam("resumeLeavingWorking") String resumeLeavingWorking,
                              @RequestParam("resumeLiveCity") String resumeLiveCity, @RequestParam("resumePersonid") String resumePersonid, @RequestParam("resumeIncome") String resumeIncome,
                              @RequestParam("resumeFullPartTime") String resumeFullPartTime, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeService.bashInforInsert(custId, resumeName, reusmeRealName, resumeBirth, resumeTelno, resumeEmail,
                resumeGender, resumeLeavingWorking, resumeLiveCity, resumePersonid, resumeIncome, resumeFullPartTime);
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
}
