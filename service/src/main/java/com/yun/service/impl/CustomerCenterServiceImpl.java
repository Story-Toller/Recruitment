package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.beans.entity.Resume;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.dao.mapper.ResumeMapper;
import com.yun.service.business.CustomerCenterService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CustomerCenterServiceImpl implements CustomerCenterService {

    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    ResumeMapper resumeMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVo customerInformationList(Integer custId) {
        Customer customers = customerMapper.selectByPrimaryKey(custId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", customers);
        return resultVo;
    }
}
