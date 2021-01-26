package com.tledu.cn.service.impl;


import com.tledu.cn.dao.GradecDao;
import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.pojo.PageInfo;
import com.tledu.cn.pojo.Paperc;
import com.tledu.cn.service.GradecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}

