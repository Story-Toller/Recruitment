package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.beans.entity.CustomerCollection;
import com.yun.beans.vo.JobCollectionVo;
import com.yun.dao.mapper.CustomerCollectionMapper;
import com.yun.service.business.Collectionservice;
import com.yun.sysytem.utils.PageHelper;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CollectionServiceImpl implements Collectionservice {

    @Autowired
    CustomerCollectionMapper customerCollectionMapper;
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public ResultVo collection(Integer custId, Integer jobId) {
        List<CustomerCollection> collection = customerCollectionMapper.collection(custId, jobId);
        if (custId == null) {
            ResultVo resultVo = new ResultVo(ResStatus.LOGIN_TIMEOUT, "请先登录", null);
            return resultVo;
        } else {
            if (collection.size() == 0) {
                CustomerCollection customerCollection = new CustomerCollection();
                customerCollection.setCustId(custId);
                customerCollection.setJobId(jobId);
                customerCollection.setCollectionTime(s.format(new Date()));
                int insert = customerCollectionMapper.insert(customerCollection);
                ResultVo resultVo = new ResultVo(ResStatus.OK, "收藏成功", insert);
                return resultVo;
            } else {
                ResultVo resultVo = new ResultVo(ResStatus.CANNOTCOLL, "请勿重复收藏", null);
                return resultVo;
            }
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVo showCollectionByCusId(Integer custId, int pageNum, int limit) {
        int start = (pageNum - 1) * limit;
        List<JobCollectionVo> jobCollectionVos = customerCollectionMapper.showJobCollection(custId, start, limit);
        int jobs = jobCollectionVos.size();
        int pageCount = jobs % limit == 0 ? jobs / limit : jobs / limit + 1;
        PageHelper<JobCollectionVo> jobCollectionVoPageHelper = new PageHelper<>(jobs, pageCount, jobCollectionVos);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobCollectionVoPageHelper);
        return resultVo;
    }
}
