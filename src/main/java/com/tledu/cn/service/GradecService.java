package com.tledu.cn.service;


import com.tledu.cn.pojo.Grade;
import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.pojo.PageInfo;
import com.tledu.cn.pojo.Paperc;

import java.util.List;

public interface GradecService {
    public PageInfo<Paperc> findAllByPage(Integer currentPage, Integer pageSize, String str);
    public Paperc selectPaperAll(Gradec gradec,int a);
    public Gradec insertPapercAll(Gradec gradec);
    public int insertGrade(Grade grade);
    public String selectAllScore(String str);
    public String selectMin(String str);
    public String selectMax(String str);
    public String selectCount1(String str);
    public String selectCount2(String str);
    public Gradec selectTil(String str);
    public void updateGradec(String str);
}
