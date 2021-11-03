package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.service.business.CustomerService;
import com.yun.sysytem.utils.MD5Utils;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

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
                customer1.setCustRegistTime(s.format(new Date()));
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
                JwtBuilder builder = Jwts.builder();
                HashMap<String, Object> objectObjectHashMap = new HashMap<>();
                objectObjectHashMap.put("key1", "value1");
                objectObjectHashMap.put("key2", "value2");
                objectObjectHashMap.put("key3", "value3");

                String token = builder.setSubject(customer.get(0).getCustName())           //设置token中携带的数据
                        .setIssuedAt(new Date())                            //设置token生成时间
                        .setId(customer.get(0).getCustId() + "")            //设置用户id
                        .setClaims(objectObjectHashMap)
                        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))//设置token过期时间
                        .signWith(SignatureAlgorithm.HS512, "syx12138asdf")     //设置token解密密码
                        .compact();


                return new ResultVo(ResStatus.OK, token, customer.get(0));
            } else {
                return new ResultVo(ResStatus.NO, "登陆失败,密码错误", null);
            }
        }

    }

    @Override
    public ResultVo updateBashInfor(int cusId, String cusName,
                                    String cusPhone, String cusEmail,
                                    String other2) {
        int i = customerMapper.updateBashInfroByCusId(cusId, cusName, cusPhone, cusEmail, other2);
        if (i > 0) {
            return new ResultVo(ResStatus.OK, "update success", null);
        } else {
            return new ResultVo(ResStatus.NO, "update failed", null);
        }
    }

    @Override
    public ResultVo DataIsVisible(Integer custId) {
        int i = customerMapper.DataIsVisible(custId);
        if (i > 0) {
            return new ResultVo(ResStatus.OK, "update success", i);
        } else {
            return new ResultVo(ResStatus.NO, "update failed", null);
        }
    }

    @Override
    public ResultVo DataIsNotVisible(Integer custId) {
        int i = customerMapper.DataIsNotVisible(custId);
        if (i > 0) {
            return new ResultVo(ResStatus.OK, "update success", i);
        } else {
            return new ResultVo(ResStatus.NO, "update failed", null);
        }
    }
}
