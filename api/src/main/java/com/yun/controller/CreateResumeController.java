package com.yun.controller;

import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import io.jsonwebtoken.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
@CrossOrigin
@Api(value = "提供创建简历接口", tags = "简历管理")
public class CreateResumeController {

    @GetMapping("/create")
    @ApiImplicitParam(dataType = "String", name = "token", value = "令牌", required = true)
    public ResultVo ResumeCreate(String token) {
        if (token == null) {
            return new ResultVo(ResStatus.NO, "请先登录", null);
        } else {
            //            验证token
            JwtParser parser = Jwts.parser();
            parser.setSigningKey("syx12138asdf");       //解析token时的singingKey必须与生成时的密码一致
//            如果token正确 1. 密码正确  ||  2. 登录有效期内
//            正常放行，否则报错
            try {
                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                Claims body = claimsJws.getBody();//获取用户数据
                String subject = body.getSubject();//获取生成token时设置的subject
                String key1 = body.get("key1", String.class);//获取生成token时map的值

                return new ResultVo(ResStatus.OK, "success", null);
            } catch (Exception e) {
                return new ResultVo(ResStatus.NO, "请先登录", null);
            }
        }
    }
}
