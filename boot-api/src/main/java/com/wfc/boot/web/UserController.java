package com.wfc.boot.web;

import com.alibaba.fastjson.JSON;
import com.wfc.boot.service.UserService;
import com.wfc.boot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public  String login(User user){
        if (user == null ){
            user = new User();
            user.setId(1l);
        }else {
            user.setId(1l);
        }

        User result = userService.find(user);

        return JSON.toJSON(result).toString();
        //return "login su222" ;
    }
}
