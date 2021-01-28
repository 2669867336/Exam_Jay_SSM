package com.tledu.cn.dao;

import com.tledu.cn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-20-11:11:01
 */
@Mapper
public interface UserDao {

    public void register(User user);
    public String isExist(User user);
    public String login(User user);
    public void startStatus(User user);
    public void stopStatus(User user);
    public void userDelete(User user);
    public List<User> userSelectAll();

}
