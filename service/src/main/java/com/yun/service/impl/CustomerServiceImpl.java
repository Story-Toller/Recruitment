package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.service.business.CustomerService;
import com.yun.sysytem.utils.MD5Utils;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Transactional
    public ResultVo customerResgit(String email, String password, String name) {
        synchronized (this) {
//        根据用户邮箱查询，这个用户是否被注册
            Example example = new Example(Customer.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("custEmail", email);
            List<Customer> customers = customerMapper.selectByExample(example);

            if (customers.size() == 0) {
                String md5pwd = MD5Utils.md5(password);
                Customer customer1 = new Customer();
                customer1.setCustName(name);
                customer1.setCustEmail(email);
                customer1.setCustPassword(md5pwd);
                customer1.setCustRegistTime(new Date());
                int i = customerMapper.insert(customer1);
                if (i > 0) {
                    return new ResultVo(ResStatus.OK, "注册成功", null);
                } else {
                    return new ResultVo(ResStatus.NO, "注册失败", null);
                }
            } else {
                return new ResultVo(ResStatus.NO, "邮箱已被占用", null);
            }

        }
    }

    @Override
    public ResultVo checkLogin(String email, String password) {
        //        根据用户邮箱查询，这个用户是否被注册
        Example example = new Example(Customer.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("custEmail", email);
        List<Customer> customer = customerMapper.selectByExample(example);
        if (customer.size() == 0) {
            return new ResultVo(ResStatus.NO, "登陆失败,用户名不存在", null);
        } else {
            String s = MD5Utils.md5(password);
            if (s.equals(customer.get(0).getCustPassword())) {
                return new ResultVo(ResStatus.OK, "登陆成功", customer.get(0));
            } else {
                return new ResultVo(ResStatus.NO, "登陆失败,密码错误", null);
            }
        }

    }
}
