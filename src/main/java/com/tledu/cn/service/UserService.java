package com.tledu.cn.service;

import com.tledu.cn.pojo.User;

/**
 * @author sxwstart
 * @create 2021-01-20-10:55:54
 */
public interface UserService {
    public int register(User user);
    public int login(User user);
}
