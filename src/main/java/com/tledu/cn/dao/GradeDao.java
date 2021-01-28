package com.tledu.cn.dao;

import com.tledu.cn.pojo.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GradeDao {

    public int insert1(Grade grade);
    public List<Grade> selectGAll(String str);
    public String selectGradeId(Grade grade);
}
