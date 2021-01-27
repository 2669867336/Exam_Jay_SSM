package com.tledu.cn.dao;

import com.tledu.cn.pojo.Grade;

import java.util.List;

public interface GradeDao {

    public int insert1(Grade grade);
    public List<Grade> selectGAll();
}
