package com.wfc.boot.mapper;

import com.wfc.boot.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserMapper extends Mapper<User> {

    List<User> selectUerRole(User user);
}
