package com.lenway.api.controller;

import com.lenway.api.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        // 直接编写业务逻辑 @RequestBody User user
        return "success";
    }

    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId("11");
        user.setAnt("12345678");
        user.setPwd("12345678");
        user.setEmail("123@qq.com");
        // 注意哦，这里是直接返回的User类型，并没有用ResultVO进行包装
        return user;
    }

    @ApiOperation("获得所有用户")
    @GetMapping("/getAllUser")
    public Map<String, List<User>> getAllUser() {

        User user1 = new User();
        user1.setId("11");
        user1.setAnt("12345678");
        user1.setPwd("12345678");
        user1.setEmail("123@qq.com");

        User user2 = new User();
        user2.setId("11");
        user2.setAnt("9877986");
        user2.setPwd("adasdasd");
        user2.setEmail("456@qq.com");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

        Map<String, List<User>> map = new HashMap<>();
        map.put("items", list);

        Set<String> keys = map.keySet(); //获取所有的key值
        for(String key: keys){
            System.out.println(key);
        }
        //用ResultVO进行包装了
        //return new ResultVO<>(user);
        // 这里是直接返回的map，没用ResultVO进行包装，beforeBodyWrite会自动增强操作，给我们包装起来。
        return map;
    }
}
