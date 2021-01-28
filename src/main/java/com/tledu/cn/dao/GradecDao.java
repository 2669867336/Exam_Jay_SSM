package com.tledu.cn.dao;

import com.tledu.cn.pojo.Grade;
import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.pojo.Paperc;

import java.util.List;

public interface GradecDao {
    public List<Paperc> selectExam(String str);
    public Paperc selectPaperAll(String str);
    public int insertPapercAll(Gradec gradec);
    public int insertGrade(Gradec gradec);
    public String selectAllScore(String str);
    public String selectMin(String str);
    public String selectMax(String str);
    public String selectCount1(String str);
    public String selectCount2(String str);
    public Gradec selectTil(Gradec gradec);
    public void updateGradec(Gradec gradec);

}
