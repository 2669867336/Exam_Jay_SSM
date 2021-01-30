package com.tledu.cn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tledu.cn.pojo.Paper;
import com.tledu.cn.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tledu.cn.util.pageUtils;

import java.util.List;
import java.util.Map;

/**
 * @author sxwstart
 * @create 2021-01-23-10:17:12
 */
@Controller
public class PaperController {

    @Autowired
    private PaperService paperServiceImpl;

    @RequestMapping("/paperAdd")
    @ResponseBody
    public int insertPaper(@RequestBody Paper paper){
        int mark=0;
        mark = paperServiceImpl.paperInsert(paper);

        return mark;
    }
    @RequestMapping("/paperDelete")
    @ResponseBody
    public int seletePaper(@RequestBody Paper paper){
        int mark=0;
        mark = paperServiceImpl.paperDelete(paper);

        return mark;
    }

    @RequestMapping("/paperSelectAll")
    @ResponseBody
    public pageUtils validateProjectCodeJ(@RequestBody Map<String,Object> params){

//        核心分页代码
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("pageNumber").toString()));
        List<Paper> papers = paperServiceImpl.paperSelectAll();
        PageInfo<Paper> pageInfo = new PageInfo<Paper>(papers);

        return new pageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    @RequestMapping("/paperUpdate")
    @ResponseBody
    public int paperUpdate(@RequestBody Paper paper){
        int mark;
         mark = paperServiceImpl.paperUpdate(paper);
        return mark;
    }

    @RequestMapping("/statusUpdate")
    @ResponseBody
    public int paperUpdateStatus(@RequestBody Paper paper){
        int mark;
        mark=paperServiceImpl.paperUpdateStatus(paper);
        return mark;
    }

    @RequestMapping("/paperSelectPutong")
    @ResponseBody
    public pageUtils paperSelectPutong(@RequestBody Map<String,Object> params){

//        核心分页代码
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("pageNumber").toString()));
        List<Paper> papers = paperServiceImpl.paperSelectPutong();
        PageInfo<Paper> pageInfo = new PageInfo<Paper>(papers);

        return new pageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    @RequestMapping("/paperSelectMoni")
    @ResponseBody
    public pageUtils paperSelectMoni(@RequestBody Map<String,Object> params){

//        核心分页代码
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("pageNumber").toString()));
        List<Paper> papers = paperServiceImpl.paperSelectMoni();
        PageInfo<Paper> pageInfo = new PageInfo<Paper>(papers);

        return new pageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    @RequestMapping("/paperSelectMohu")
    @ResponseBody
    public pageUtils paperSelectMohu(@RequestBody Map<String,Object> params){

//        核心分页代码
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("pageNumber").toString()));
        List<Paper> papers = paperServiceImpl.paperSelectMohu(params.get("p_title").toString());
        PageInfo<Paper> pageInfo = new PageInfo<Paper>(papers);

        return new pageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    @RequestMapping("/paperDeleteAll")
    @ResponseBody
    public int paperDeleteAll(@RequestBody Paper paper){
        int mark;
        if (paper.getPaperName()!=""&&paper.getPaperName()!=null){
            paperServiceImpl.paperDeleteAll(paper);
            mark=1;
        }else{
            mark=0;
        }
        return mark;
    }
}
