package com.tledu.cn.controller;

import com.tledu.cn.pojo.User;
import com.tledu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.JDK8DateUtil;

import java.util.UUID;

/**
 * @author sxwstart
 * @create 2021-01-20-10:57:06
 */
@Controller
public class MyController {



    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/userRegister"/*,consumes="application/x-www-form-urlencoded"*/)
    @ResponseBody
    public int register(@RequestBody User user){

        int mark = userServiceImpl.register(user);
        return mark;
    }

    @RequestMapping("/userLogin")
    @ResponseBody
    public int login(@RequestBody User user){

        int mark = userServiceImpl.login(user);
        return mark;

    }

}
