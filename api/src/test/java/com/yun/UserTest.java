package com.yun;

import com.yun.beans.entity.User;
import com.yun.dao.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test() {

        User user = userMapper.queryUserByName("123");
        System.out.println(user);
    }
}
