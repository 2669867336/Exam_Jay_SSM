package com.tledu.cn.service.impl;

import com.tledu.cn.dao.ManagerDao;
import com.tledu.cn.pojo.Manager;
import com.tledu.cn.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-28-15:51:09
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;

    @Override
    public int managerLogin(Manager manager) {
        int mark=0;
        List<Manager> pwds = managerDao.managerLogin(manager.getManagerAcc());
        for (int i=0;i<pwds.size();i++){
            if (manager.getManagerPwd().equals(pwds.get(i))){
//                System.out.println(manager.getManagerPwd()+"---"+pwds.get(i));
                mark=1;
                break;
            }else{
                mark= 0;
            }
        }

        return 0;
    }
}
