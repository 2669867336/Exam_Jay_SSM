package com.tledu.cn.dao;

import com.tledu.cn.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sxwstart
 * @create 2021-01-20-11:11:01
 */
@Mapper
public interface UserDao {

    public void register(User user);

}
