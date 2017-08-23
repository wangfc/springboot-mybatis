package com.wfc.boot.mapper;

import com.wfc.boot.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

@Repository
public interface UserMapper extends BaseMapper<User>{


}
