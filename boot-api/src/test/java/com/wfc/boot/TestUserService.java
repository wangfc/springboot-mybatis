package com.wfc.boot;

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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestUserService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;

    @Test
    public void testMapper(){
        System.out.println(userMapper);
        User u = new User();
        u.setId(1l);
        User user = userMapper.find(u);
        System.out.println(user);
    }

    @Test
    public void testService(){
        User u = new User();
        u.setId(1l);
        User user = userService.find(u);
        logger.info(""+user);
    }
}
