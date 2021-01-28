package com.tledu.cn.pojo;

import javax.swing.*;

/**
 * @author sxwstart
 * @create 2021-01-20-10:34:46
 */
public class User {

    private String userId;
    private String userName;
    private String userAcc;
    private String userPwd;
    private String createtime;
    private String isDelete;
    private String userStatus;

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAcc='" + userAcc + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public User(String userId, String userName, String userAcc, String userPwd, String createtime, String isDelete) {
        this.userId = userId;
        this.userName = userName;
        this.userAcc = userAcc;
        this.userPwd = userPwd;
        this.createtime = createtime;
        this.isDelete = isDelete;
    }

    public User() {
    }
}
