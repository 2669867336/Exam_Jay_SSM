package com.tledu.cn.dao;

import com.tledu.cn.pojo.Grade;
import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.pojo.Paperc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GradecDao {
    public List<Paperc> selectExam(String str);
    public Paperc selectPaperAll(String str);
    public int insertPapercAll(Gradec gradec);
    public int insertGrade(Gradec gradec);
    public String selectAllScore(Gradec gradec);
    public String selectMin(Gradec gradec);
    public String selectMax(Gradec gradec);
    public String selectCount1(Gradec gradec);
    public String selectCount2(Gradec gradec);
    public Gradec selectTil(Gradec gradec);
    public void updateGradec(Gradec gradec);

}
