package com.tledu.cn.dao;

import com.tledu.cn.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-28-15:46:17
 */
@Mapper
public interface ManagerDao {
    public List<Manager> managerLogin(String acc);
}
