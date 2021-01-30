package com.tledu.cn.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tledu.cn.pojo.Grade;
import com.tledu.cn.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tledu.cn.util.pageUtils;

import java.util.List;
import java.util.Map;

@Controller
public class GradeController {
    @Autowired
    private GradeService gradeImpl;

    @RequestMapping("/selectGrade")
    @ResponseBody
    public int selectGrade(@RequestBody Grade grade){
        int i = gradeImpl.insert1(grade);
        return i;


    }

    //成绩分页
    @RequestMapping("/selectGradeAll")
    @ResponseBody
    public pageUtils validateProjectCodeKeyword(@RequestBody Map<String,Object> params){
        List<Grade> exs = gradeImpl.selectGAll(params.get("paperId").toString());
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("pageNumber").toString()));

        PageInfo<Grade> pageInfo = new PageInfo<Grade>(exs);

        return new pageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }
}
