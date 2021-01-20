package com.tledu.cn.service.impl;

import com.tledu.cn.dao.UserDao;
import com.tledu.cn.pojo.User;
import com.tledu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sxwstart
 * @create 2021-01-20-11:09:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        System.out.println(user);
        userDao.register(user);
    }
}
