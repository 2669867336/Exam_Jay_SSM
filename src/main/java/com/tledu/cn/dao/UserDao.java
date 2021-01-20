package com.tledu.cn.dao;

import com.tledu.cn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.scheduling.support.SimpleTriggerContext;

/**
 * @author sxwstart
 * @create 2021-01-20-11:11:01
 */
@Mapper
public interface UserDao {

    public void register(User user);
    public String isExist(User user);
    public String login(User user);

}
