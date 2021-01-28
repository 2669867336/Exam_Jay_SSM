package com.tledu.cn.dao;

import com.tledu.cn.pojo.Gradec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YuejuanDao {
    public List<Gradec> selectYuejuan(Gradec gradec);
}
