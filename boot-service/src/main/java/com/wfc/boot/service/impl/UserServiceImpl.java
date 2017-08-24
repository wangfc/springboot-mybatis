package com.wfc.boot.service.impl;

import com.wfc.boot.entity.User;
import com.wfc.boot.mapper.UserMapper;
import com.wfc.boot.service.UserService;
import com.wfc.boot.support.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.wfc.boot.support.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Mapper getMapper() {
        return (Mapper) userMapper;
    }

    @Override
    public User find(User qm) {
        return userMapper.selectOne(qm);
    }


}
