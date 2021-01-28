package com.tledu.cn.controller;

import com.tledu.cn.pojo.Manager;
import com.tledu.cn.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sxwstart
 * @create 2021-01-28-15:56:30
 */
@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerServiceImpl;

    @RequestMapping("/managerLogin")
    @ResponseBody
    public int managerLogin(@RequestBody Manager manager){
        if (manager.getManagerAcc()!=""&&manager.getManagerAcc()!=null){
            return managerServiceImpl.managerLogin(manager);

        }else{

            return 0;
        }
    }
}
