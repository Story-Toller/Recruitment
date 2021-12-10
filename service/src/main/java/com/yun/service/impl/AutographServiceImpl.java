package com.yun.service.impl;

import com.yun.beans.entity.Autograph;
import com.yun.dao.mapper.AutographMapper;
import com.yun.service.business.AutographService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class AutographServiceImpl implements AutographService {
    @Autowired
    AutographMapper autographMapper;


    public ResultVo chenge(Integer custId, String custAutograph) {
        Example example = new Example(Autograph.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("custId",custId);
        List<Autograph> autographs = autographMapper.selectByExample(example);
        if (autographs.size()!=0) {
            Autograph autograph = autographMapper.selectOneByExample(example);
            autograph.setCustId(custId);
            autograph.setCustAutograph(custAutograph);
            String s = updateById(autograph);
            if (s.equals("no")) {
                ResultVo resultVo = new ResultVo(ResStatus.NO, "failed", null);
                return resultVo;
            } else {
                ResultVo resultVos = new ResultVo(ResStatus.OK, "success", null);
                return resultVos;
            }
        } else {
            Autograph autograph = new Autograph();
            autograph.setCustId(custId);
            autograph.setCustAutograph(custAutograph);
            int insert = autographMapper.insert(autograph);
            if (insert == 0) {
                ResultVo resultVo = new ResultVo(ResStatus.NO, "failed", null);
                return resultVo;
            } else {
                ResultVo resultVos = new ResultVo(ResStatus.OK, "success", null);
                return resultVos;
            }
        }
    }

    @Override
    public String updateById(Autograph autograph) {
        int i = autographMapper.updateByPrimaryKey(autograph);

        if (i == 0) {
            new ResultVo(ResStatus.NO, "failed", null);
            return "no";
        } else {
            new ResultVo(ResStatus.OK, "success", null);
            return "yes";
        }
    }

    @Override
    public ResultVo showAutograph(Integer custId) {
        Example example = new Example(Autograph.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("custId",custId);
        List<Autograph> autographs = autographMapper.selectByExample(example);
        if (autographs.size()==0){
            ResultVo resultVos = new ResultVo(ResStatus.NO, "null", "你还没有签名哦，快去设置一个吧");
            return resultVos;
        }else {
            ResultVo resultVo = new ResultVo(ResStatus.OK, "success", autographs);
            return resultVo;
        }

    }
}
