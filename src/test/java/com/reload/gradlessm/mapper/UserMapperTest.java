package com.reload.gradlessm.mapper;

import com.reload.gradlessm.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper dao;

    @Test
    public void testSelectUser() throws Exception {
        int id = 3;
        User user = dao.getUserById(id);
        System.out.println(user);
    }
}
