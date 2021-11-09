package com.yun.service.business;

import com.yun.beans.entity.Customer;
import com.yun.sysytem.vo.ResultVo;

public interface CustomerCenterService {
//    用户基本信息展示
    ResultVo customerInformationList(Integer custId);
}
