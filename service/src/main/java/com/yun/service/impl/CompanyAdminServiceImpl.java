package com.yun.service.impl;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.service.business.CompanyAdminService;
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
public class CompanyAdminServiceImpl implements CompanyAdminService {

    @Autowired
    CompanyAdminMapper companyAdminMapper;

    @Transactional
    public ResultVo CompanyAdminRegister(String email, String password, String name) {
        synchronized (this) {
            Example example = new Example(CompanyAdmin.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("companyAdminEmail", email);
            List<CompanyAdmin> companyAdmins = companyAdminMapper.selectByExample(example);

            if (companyAdmins.size() == 0) {
                String s = MD5Utils.md5(password);
                CompanyAdmin companyAdmin = new CompanyAdmin();
                companyAdmin.setCompanyAdminEmail(email);
                companyAdmin.setCompanyAdminName(name);
                companyAdmin.setCompanyAdminPassword(s);
                companyAdmin.setCompanyAdminCreateTime(new Date());
                int insert = companyAdminMapper.insert(companyAdmin);
                if (insert > 0) {
                    return new ResultVo(ResStatus.OK, "注册成功", null);

                } else {
                    return new ResultVo(ResStatus.NO, "注册失败", null);
                }

            } else {
                return new ResultVo(ResStatus.NO, "邮箱号已被占用", null);
            }

        }
    }

    @Override
    public ResultVo CompanyAdminLogin(String email, String password) {
        Example example = new Example(CompanyAdmin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("companyAdminEmail", email);
        List<CompanyAdmin> companyAdmins = companyAdminMapper.selectByExample(example);
        if (companyAdmins.size() == 0) {
            return new ResultVo(ResStatus.NO, "登陆失败，邮箱不存在", null);
        } else {
            String s = MD5Utils.md5(password);
            if (s.equals(companyAdmins.get(0).getCompanyAdminPassword())) {
                return new ResultVo(ResStatus.OK, "登陆成功", null);
            } else {
                return new ResultVo(ResStatus.NO, "登陆失败，密码错误", null);
            }
        }
    }
}
