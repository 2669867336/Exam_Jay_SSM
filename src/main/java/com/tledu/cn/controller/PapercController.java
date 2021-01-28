package com.tledu.cn.controller;

import com.tledu.cn.pojo.Paperc;
import com.tledu.cn.service.PapercService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-25-12:07:12
 */
@Controller
public class PapercController {

    @Autowired
    private PapercService papercServiceImpl;

    @RequestMapping("/papercAdd")
    @ResponseBody
    public int papercAdd(@RequestBody Paperc paperc){
        System.out.println(paperc);
        int mark;
        String id = papercServiceImpl.selectTilte(paperc);
        if (id!=""&&id!=null){
            int i = papercServiceImpl.papercAdd1(id);
            if (i>0){
                mark=1;
            }else{
                mark=0;
            }
        }else{
            mark=papercServiceImpl.papercAdd(paperc);
        }
        return mark;

    }

    @RequestMapping("/papercSelect")
    @ResponseBody
    public List<Paperc> papercSelect(@RequestBody Paperc paperc){

        List<Paperc> papercs = papercServiceImpl.papercSelect(paperc);
        System.out.println(papercs);
        return papercs;
    }

    @RequestMapping("/papercDelete")
    @ResponseBody
    public int papercDelete(@RequestBody Paperc paperc){
        int mark;
        mark=papercServiceImpl.papercDelete(paperc);
        return mark;
    }

}
