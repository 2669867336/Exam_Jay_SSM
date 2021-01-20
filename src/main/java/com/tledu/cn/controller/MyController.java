package com.tledu.cn.controller;

import com.tledu.cn.pojo.User;
import com.tledu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sxwstart
 * @create 2021-01-20-10:57:06
 */
@Controller
public class MyController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "userRegister")
    public void register(@RequestBody User user){

//    userServiceImpl.register(user);
    userServiceImpl.register(new User("测试","root","root"));

    }

}
