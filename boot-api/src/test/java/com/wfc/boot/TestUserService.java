package com.wfc.boot;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wfc.boot.entity.User;
import com.wfc.boot.mapper.UserMapper;
import com.wfc.boot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestUserService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;


    @Test
    public void testCommonMapper(){
        User u = new User();
        u.setId(1);
        List<User> select = userMapper.select(u);
        logger.info(""+select);
    }

    @Test
    public void testCommonMapperQueryPage(){
        PageHelper.startPage(2,3);
        List<User> select = userMapper.select(null);
        logger.info(""+ JSON.toJSONString(select ));

        for (User user : select ) {
            logger.info(""+user);
        }

    }

    @Test
    public void test(){
        User u = new User();
        u.setId(1);
        List<User> select = userService.select(u);
        logger.info(""+select);
    }
}
