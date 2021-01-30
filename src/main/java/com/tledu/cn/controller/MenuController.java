package com.tledu.cn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tledu.cn.pojo.Menu;
import com.tledu.cn.service.MenuService;
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
 * @create 2021-01-29-21:53:31
 */
@Controller
public class MenuController {

    @Autowired
    private MenuService menuServiceImpl;

    @RequestMapping("/addMenu")
    @ResponseBody
    public int menuAdd(@RequestBody Menu menu){
        int i = menuServiceImpl.menuAdd(menu);
        return i;
    }

    @RequestMapping("/selectMenu")
    @ResponseBody
    public pageUtils validateProjectCodeX(@RequestBody Map<String,Object> params){

//        核心分页代码
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("pageNumber").toString()));
        List<Menu> exs = menuServiceImpl.menuSelectAll();
//        System.out.println("---"+exs);
        PageInfo<Menu> pageInfo = new PageInfo<Menu>(exs);

        return new pageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    @RequestMapping("/updateMenu")
    @ResponseBody
    public int menuUpdate(@RequestBody Menu menu){
        int i = menuServiceImpl.menuUpdate(menu);
        return i;
    }
    @RequestMapping("/menuSelete")
    @ResponseBody
    public List<Menu> menuSelect(){
        List<Menu> i = menuServiceImpl.menuSelect();
//        System.out.println(i);
        return i;
    }

    @RequestMapping("/deleteMenu")
    @ResponseBody
    public int menuDelete(@RequestBody Menu menu){
        int i = menuServiceImpl.menuDelete(menu);
        return i;
    }
}
