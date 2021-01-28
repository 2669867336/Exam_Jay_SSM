package com.tledu.cn.service;

import com.tledu.cn.pojo.User;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-20-10:55:54
 */
public interface UserService {
    public int register(User user);
    public int login(User user);
    public void startStatus(User user);
    public void stopStatus(User user);
    public void userDelete(User user);
    public List<User> userSelectAll();
}
