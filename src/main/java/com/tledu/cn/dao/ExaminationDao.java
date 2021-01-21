package com.tledu.cn.dao;

import com.tledu.cn.pojo.Examination;

import java.util.List;

public interface ExaminationDao {
    public int insertExamination(Examination examination);
    public List<Examination> selectExamination();
    public int updateExamination(Examination examination);
    public int deleteExamination(Examination examination);
}
