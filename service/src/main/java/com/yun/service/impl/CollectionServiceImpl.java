package com.yun.service.impl;

import com.yun.beans.entity.CustomerCollection;
import com.yun.dao.mapper.CustomerCollectionMapper;
import com.yun.service.business.Collectionservice;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CollectionServiceImpl implements Collectionservice {

    @Autowired
    CustomerCollectionMapper customerCollectionMapper;
    SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public ResultVo addCollection(CustomerCollection customerCollection) {
        customerCollection.setCollectionTime(s.format(new Date()));
        int insert = customerCollectionMapper.insert(customerCollection);

        if (insert > 0) {
            return new ResultVo(ResStatus.OK, "success", null);
        } else {
            return new ResultVo(ResStatus.NO, "failed", null);
        }
    }
}
