package com.tledu.cn.controller;

import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.service.YuejuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class yuejuan {
    @Autowired
    private YuejuanService yuejuanService;

    @RequestMapping("/selectYuejuan")
    @ResponseBody
    public List<Gradec> selectYue(@RequestBody Gradec gradec){
        List<Gradec> gradecs = yuejuanService.selectYuejuan(gradec);
        return gradecs;
    }
}
