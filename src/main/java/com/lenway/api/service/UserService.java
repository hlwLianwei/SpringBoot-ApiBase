package com.lenway.api.service;

import com.lenway.api.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    //@Autowired
    private UserJrp userJrp;

    /**
     * 获取所有用户
     * @return
     */
    public List<User> get(){
        //List<User> list = userJrp.findAll();
        return new ArrayList<>();
    }
}
