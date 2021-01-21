package com.tledu.cn.service.impl;

import com.tledu.cn.dao.ExaminationDao;
import com.tledu.cn.pojo.Examination;
import com.tledu.cn.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.JDK8DateUtil;

import java.util.List;
import java.util.UUID;

@Service
public class ExaminationImpl implements ExaminationService {
    @Autowired
    private ExaminationDao examinationDao;


    @Override
    public int insertExamination(Examination examination) {
        int mark=0;

//        if (examination.getExaminationTitle()!=null&&examination.getExaminationTitle()!=""
//                &&examination.getExaminationA()!=null&&examination.getExaminationA()!=""
//        &&examination.getExaminationB()!=null&&examination.getExaminationB()!=""
//        &&examination.getExaminationC()!=null&&examination.getExaminationC()!=""
//        &&examination.getExaminationD()!=null&&examination.getExaminationD()!=""
//        &&examination.getExaminationAnswer()!=null&&examination.getExaminationAnswer()!=""
//        &&examination.getExaminationDegree()!=null&&examination.getExaminationDegree()!=""
//        &&examination.getExaminationScore()!=null&&examination.getExaminationScore()!=""
//        &&examination.getExaminationType()!=null&&examination.getExaminationType()!=""){

            examination.setExaminationId(UUID.randomUUID().toString());
            examination.setCreatetime(JDK8DateUtil.LocalDateTime2String(null,null));
            examination.setIsDelete("0");
            mark = examinationDao.insertExamination(examination);

//        }
//        else{
            mark=2;//没插进去 或者其他情况
//        }
        return mark;
    }

    @Override
    public int updateExamination(Examination examination) {
        int mark=0;//0代表什么操作也没发生
        mark = examinationDao.updateExamination(examination);
        return mark;
    }

    @Override
    public int deleteExamination(Examination examination) {
        int mark=0;//0代表什么操作也没发生
        mark = examinationDao.deleteExamination(examination);
        return mark;
    }

    @Override
    public List<Examination> selectExamination() {

        return null;
    }
}
