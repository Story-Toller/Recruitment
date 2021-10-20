package com.yun.service.business;

import com.yun.beans.entity.CustomerCollection;
import com.yun.sysytem.vo.ResultVo;

public interface Collectionservice {
//    收藏职位信息
    ResultVo addCollection(CustomerCollection customerCollection);
}
