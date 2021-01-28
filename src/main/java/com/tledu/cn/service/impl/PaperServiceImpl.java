package com.tledu.cn.service.impl;

import com.tledu.cn.dao.PaperDao;
import com.tledu.cn.pojo.Paper;
import com.tledu.cn.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.JDK8DateUtil;

import java.util.List;
import java.util.UUID;

/**
 * @author sxwstart
 * @create 2021-01-23-10:10:34
 */
@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDao paperDao;

    @Override
    public int paperInsert(Paper paper) {
        int mark;
        if (paper.getPaperType()!=""&&paper.getPaperType()!=null&&
        paper.getPaperClassify()!=""&&paper.getPaperClassify()!=null&&
        paper.getPaperName()!=""&&paper.getPaperName()!=null&&
        paper.getQuestionMethod()!=""&&paper.getQuestionMethod()!=null&&
        paper.getPaperTime()!=""&&paper.getPaperTime()!=null&&
        paper.getStartTime()!=""&&paper.getStartTime()!=null){

            paper.setPaperId(UUID.randomUUID().toString());
            paper.setCreatetime(JDK8DateUtil.LocalDateTime2String(null,null));
            paper.setIsDelete("0");
            paper.setPaperStatus("关闭");
            //还有url没添加

            int i = paperDao.paperInsert(paper);
            if (i>0){
                mark=1;
            }else {
                mark=0;
            }
        }else {
            mark=0;
        }
        return mark;
    }

    @Override
    public int paperDelete(Paper paper) {
        int mark;
        if (paper.getPaperName()!=""&&paper.getPaperName()!=null){
            int i = paperDao.paperDelete(paper);
            if (i>0){
                mark=1;
            }else{
                mark=0;
            }
        }else {
            mark=0;
        }

        return mark;
    }

    @Override
    public List<Paper> paperSelectAll() {

        List<Paper> papers = paperDao.paperSelectAll();

        return papers;
    }

    @Override
    public int paperUpdate(Paper paper) {
        int mark;
        if (paper.getPaperType()!=""&&paper.getPaperType()!=null&&
                paper.getPaperClassify()!=""&&paper.getPaperClassify()!=null&&
                paper.getPaperName()!=""&&paper.getPaperName()!=null&&
                paper.getQuestionMethod()!=""&&paper.getQuestionMethod()!=null&&
                paper.getPaperTime()!=""&&paper.getPaperTime()!=null&&
                paper.getStartTime()!=""&&paper.getStartTime()!=null&&
                paper.getPaperId()!=""&&paper.getPaperId()!=null){

            int i = paperDao.paperUpdate(paper);
            if (i>0){
                mark=1;
            }else{
                mark=0;
            }
        }else{
            mark=0;
        }
        return mark;
    }

    @Override
    public int paperUpdateStatus(Paper paper) {
        int mark;
        if (paper.getPaperName()!=""&&paper.getPaperName()!=null&&
            paper.getPaperStatus()!=""&&paper.getPaperStatus()!=null){
            int i = paperDao.paperUpdateStatus(paper);
            if (i>0){
                mark=1;
            }else{
                mark=0;
            }
        }else{
            mark=0;
        }
        return mark;
    }

    @Override
    public List<Paper> paperSelectPutong() {
        List<Paper> papers = paperDao.paperSelectPutong();
        return papers;
    }

    @Override
    public List<Paper> paperSelectMoni() {

        List<Paper> papers = paperDao.paperSelectMoni();
        return papers;
    }

    @Override
    public List<Paper> paperSelectMohu(String s) {
      List<Paper> papers=null;
        if (s!=""&&s!=null){
            papers = paperDao.paperSelectMohu(s);
        }
        return papers;

    }

    @Override
    public void paperDeleteAll(Paper paper) {
        String[] names = paper.getPaperName().split(",");
        for (int i=0;i<names.length;i++){
            String name=names[i].replace(",","");
            paper.setPaperName(name);
            paperDao.paperDelete(paper);
        }
    }
}
