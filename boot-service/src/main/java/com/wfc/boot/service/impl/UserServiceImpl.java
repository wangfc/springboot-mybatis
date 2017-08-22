package com.wfc.boot.service.impl;

import com.wfc.boot.entity.User;
import com.wfc.boot.mapper.UserMapper;
import com.wfc.boot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User find(User qm) {
        User user = userMapper.find(qm);
        return user;
    }
}
