package com.tledu.cn.dao;

import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.pojo.Paperc;

import java.util.List;

public interface GradecDao {
    public List<Paperc> selectExam(String str);
    public int insertExam(Gradec gradec);
}
