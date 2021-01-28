package com.tledu.cn.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author sxwstart
 * @create 2021-01-28-15:46:17
 */
@Mapper
public interface ManagerDao {
    public String managerLogin(String acc);
}
