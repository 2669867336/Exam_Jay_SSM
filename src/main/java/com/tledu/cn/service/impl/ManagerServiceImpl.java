package com.tledu.cn.service.impl;

import com.tledu.cn.dao.ManagerDao;
import com.tledu.cn.pojo.Manager;
import com.tledu.cn.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        String pwd = managerDao.managerLogin(manager.getManagerAcc());
        if (manager.getManagerPwd().equals(pwd)){
            return 1;
        }else{
            return 0;
        }
    }
}
