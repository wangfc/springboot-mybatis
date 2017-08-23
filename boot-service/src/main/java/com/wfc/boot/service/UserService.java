package com.wfc.boot.service;

import com.wfc.boot.entity.User;
import com.wfc.boot.support.BaseService;

public interface UserService extends BaseService<User>{
    User find(User qm);

}
