package com.wfc.boot.mapper;

import com.wfc.boot.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User find(User user);
}
