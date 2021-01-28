package com.tledu.cn.service;

import com.tledu.cn.pojo.Grade;

import java.util.List;

public interface GradeService {

    public int insert1(Grade grade);
    public List<Grade> selectGAll(String str);
}
