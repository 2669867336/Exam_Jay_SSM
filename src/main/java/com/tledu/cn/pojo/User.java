package com.tledu.cn.pojo;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * @author sxwstart
 * @create 2021-01-20-10:34:46
 */
public class User {

    private String userName;
    private String userAcc;
    private String userPwd;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAcc='" + userAcc + '\'' +
                ", userPwd='" + userPwd + '\'' +
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

    public User(String userName, String userAcc, String userPwd) {
        this.userName = userName;
        this.userAcc = userAcc;
        this.userPwd = userPwd;
    }

    public User() {
    }
}
