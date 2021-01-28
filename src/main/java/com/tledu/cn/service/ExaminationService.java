package com.tledu.cn.service;

import com.tledu.cn.pojo.Examination;

import java.util.List;

public interface ExaminationService {
    public int insertExamination(Examination examination);
    public int updateExamination(Examination examination);
    public int deleteExamination(Examination examination);
    public List<Examination> selectExamination();
    public List<Examination> selTitleExamination(Examination examination);
    public String selectTitle(Examination examination);
    public List<Examination> selectTypeXuan();
    public List<Examination> selectTypeJian();
    public List<Examination> selectKeyword(String e_title);
    public void deleteAll(Examination examination);
}
