package com.tledu.cn.service.impl;


import com.tledu.cn.dao.GradecDao;
import com.tledu.cn.pojo.Grade;
import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.pojo.PageInfo;
import com.tledu.cn.pojo.Paperc;
import com.tledu.cn.service.GradecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.JDK8DateUtil;

import java.util.List;
import java.util.UUID;

@Service
public class GradecImpl implements GradecService {

    @Autowired
    private GradecDao gradecDao;

    @Override
    public PageInfo<Paperc> findAllByPage(Integer currentPage, Integer pageSize,String str) {
        List<Paperc> gradecList = gradecDao.selectExam(str);
        PageInfo<Paperc> pageInfo = new PageInfo<Paperc>(gradecList.size(), currentPage, pageSize, 5);
        //判断是否是最后一页,如果最后一页就显示最后一页的几条，不是最后一页就显示pageSize条
        if(currentPage==pageInfo.getTotalPage())
            pageInfo.setList(gradecList.subList((currentPage-1)*pageSize, gradecList.size()));
        else
            pageInfo.setList(gradecList.subList((currentPage-1)*pageSize, (currentPage-1)*pageSize+pageSize));
        return pageInfo;
    }

    @Override
    public Paperc selectPaperAll(Gradec gradec,int a) {
        String papercId = gradec.getPapercId();

        Paperc paperc1 = gradecDao.selectPaperAll(papercId);
        paperc1.getPapercTitle();
        paperc1.getPapercA();
        paperc1.getPapercB();
        paperc1.getPapercC();
        paperc1.getPapercD();
        paperc1.getPapercRightanswer();//正确答案
        paperc1.getPapercScore();//这题分数
        paperc1.getPapercType();//题目类型


        int score=0;
        int i=0;
        gradec.setGradecTitle(paperc1.getPapercTitle());
        gradec.setGradecA(paperc1.getPapercA());
        gradec.setGradecB(paperc1.getPapercB());
        gradec.setGradecC(paperc1.getPapercC());
        gradec.setGradecD(paperc1.getPapercD());
        gradec.setGradecRightanswer(paperc1.getPapercRightanswer());
        gradec.setGradecType(paperc1.getPapercType());
        gradec.setGradecId(UUID.randomUUID().toString());
        gradec.setGradecOnescore(paperc1.getPapercScore());
        gradec.setLogincTime(JDK8DateUtil.LocalDateTime2String(null,null));
        gradec.setIsDelete("0");
//        System.out.println(gradec.getGradecAnswer());
//        System.out.println(paperc1.getPapercRightanswer());


        Gradec gradec1 = gradecDao.selectTil(gradec);
        if (gradec1==null){
            if (gradec.getGradecAnswer().equals(paperc1.getPapercRightanswer())){
//                System.out.println("*********");
                i++;
//                System.out.println(i);
                score+= Integer.parseInt(paperc1.getPapercScore());
//                System.out.println(score);
            }
            gradec.setGradecScore(String.valueOf(score));
//            System.out.println(a);
            float acc=(float) i/ (float) a;
//            System.out.println(acc+"kkk");
            gradec.setGradecAccuracy(String.valueOf(acc));
            gradecDao.insertPapercAll(gradec);
        }else{
            gradecDao.updateGradec(gradec);

            if (gradec.getGradecAnswer().equals(paperc1.getPapercRightanswer())){
//                System.out.println("*********");
                i++;
//                System.out.println(i);
                score+= Integer.parseInt(paperc1.getPapercScore());
//                System.out.println(score);
            }
            gradec.setGradecScore(String.valueOf(score));
//            System.out.println(a);
            float acc=(float) i/ (float) a;
//            System.out.println(acc+"kkk");
            gradec.setGradecAccuracy(String.valueOf(acc));
            gradecDao.updateGradec(gradec);
        }

        return paperc1;
    }

    @Override
    public Gradec insertPapercAll(Gradec gradec) {

        String score = gradecDao.selectAllScore(gradec);
//        System.out.println(score);
        gradec.setGradecScore(score);

        String selectMin = gradecDao.selectMin(gradec);
//        System.out.println(selectMin);
        gradec.setLogincTime(selectMin);

        String selectMax = gradecDao.selectMax(gradec);
//        System.out.println(selectMax);
        gradec.setFinishcTime(selectMax);

        String a = gradecDao.selectCount1(gradec);
        String b = gradecDao.selectCount2(gradec);

        Float cFloat=Float.parseFloat(a)/Float.parseFloat(b);
        gradec.setGradecAccuracy(cFloat.toString());



        gradec.setIsDelete("0");
        gradecDao.insertGrade(gradec);
        return gradec;
    }

    @Override
    public int insertGrade(Grade grade) {
        return 0;
    }

    @Override
    public String selectAllScore(String str) {
        return null;
    }

    @Override
    public String selectMin(String str) {
        return null;
    }

    @Override
    public String selectMax(String str) {
        return null;
    }

    @Override
    public String selectCount1(String str) {
        return null;
    }

    @Override
    public String selectCount2(String str) {
        return null;
    }


    @Override
    public Gradec selectTil(Gradec gradec) {
        return null;
    }

    @Override
    public void updateGradec(Gradec gradec) {

    }
}

