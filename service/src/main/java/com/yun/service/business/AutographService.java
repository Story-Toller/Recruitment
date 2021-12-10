package com.yun.service.business;

import com.yun.beans.entity.Autograph;
import com.yun.sysytem.vo.ResultVo;

public interface AutographService {
    //    更改签名
    String updateById(Autograph autograph);

    //    展示签名
    ResultVo showAutograph(Integer custId);
}
