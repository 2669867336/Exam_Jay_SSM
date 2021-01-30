package com.tledu.cn.service.impl;

import com.tledu.cn.dao.UserDao;
import com.tledu.cn.pojo.User;
import com.tledu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tledu.cn.util.JDK8DateUtil;

import java.util.List;
import java.util.UUID;

/**
 * @author sxwstart
 * @create 2021-01-20-11:09:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int register(User user) {
        int mark;
        String id=null;
        if (user.getUserAcc()!=null&&user.getUserAcc()!=""&&user.getUserPwd()!=null&&user.getUserPwd()!=""){
             id = userDao.isExist(user);

//            System.out.println(id);
            if (id==null||id.equals("")){
                user.setUserId(UUID.randomUUID().toString());
                user.setCreatetime(JDK8DateUtil.LocalDateTime2String(null,null));
                user.setIsDelete("0");
                user.setUserStatus("开启");
//                System.out.println(user);
                userDao.register(user);
                mark=1;
            }else {
                mark=2;
            }
        }else {
            mark=2;
        }
        return mark;
    }
    @Override
    public int login(User user){
        int mark;
        if (user.getUserAcc()!=""&&user.getUserPwd()!=""){
            String pwd = userDao.login(user);
            if (user.getUserPwd().equals(pwd)){
                mark=1;
            }else{
                mark=2;
            }

        }else{
            mark=2;
        }
        return mark;
    }

    @Override
    public void startStatus(User user) {
        userDao.startStatus(user);
    }

    @Override
    public void stopStatus(User user) {
        userDao.stopStatus(user);
    }

    @Override
    public void userDelete(User user) {
        userDao.userDelete(user);
    }

    @Override
    public List<User> userSelectAll() {
        List<User> users = userDao.userSelectAll();
        return users;
    }


}
