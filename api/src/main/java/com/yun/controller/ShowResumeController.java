package com.yun.controller;

import com.yun.service.business.ShowResumeService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/showResume")
@Api(value = "简历预览", tags = "简历预览管理")
@CrossOrigin
public class ShowResumeController {

    @Autowired
    ShowResumeService showResumeService;

    @GetMapping("/bash/{resumeId}")
    @ApiOperation("查询基本信息的接口")
    public ResultVo Information(@PathVariable("resumeId")Integer resumeId) {
        ResultVo resultVo = showResumeService.showResume(resumeId);
        return resultVo;
    }

    @GetMapping("/honor/{resumeId}")
    @ApiOperation("查询荣誉信息的接口")
    public ResultVo honor(@PathVariable("resumeId")Integer resumeId) {
        ResultVo resultVo = showResumeService.showHonor(resumeId);
        return resultVo;
    }

    @GetMapping("/skill/{resumeId}")
    @ApiOperation("查询技能信息的接口")
    public ResultVo showSkill(@PathVariable("resumeId")Integer resumeId) {
        ResultVo resultVo = showResumeService.showSkill(resumeId);
        return resultVo;
    }

    @GetMapping("/workexp/{resumeId}")
    @ApiOperation("查询工作经验信息的接口")
    public ResultVo showWorkExpri(@PathVariable("resumeId")Integer resumeId) {
        ResultVo resultVo = showResumeService.showWorkExpri(resumeId);
        return resultVo;
    }

    @GetMapping("/project/{resumeId}")
    @ApiOperation("查询项目经验信息的接口")
    public ResultVo showProject(@PathVariable("resumeId")Integer resumeId) {
        ResultVo resultVo = showResumeService.showProject(resumeId);
        return resultVo;
    }
}
