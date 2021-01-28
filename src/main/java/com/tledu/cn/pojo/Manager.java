package com.tledu.cn.pojo;

/**
 * @author sxwstart
 * @create 2021-01-28-15:39:00
 */
public class Manager {
    private String managerId;
    private String managerAcc;
    private String managerPwd;
    private String createtime;
    private String isDelete;

    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", managerAcc='" + managerAcc + '\'' +
                ", managerPwd='" + managerPwd + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerAcc() {
        return managerAcc;
    }

    public void setManagerAcc(String managerAcc) {
        this.managerAcc = managerAcc;
    }

    public String getManagerPwd() {
        return managerPwd;
    }

    public void setManagerPwd(String managerPwd) {
        this.managerPwd = managerPwd;
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

    public Manager(String managerId, String managerAcc, String managerPwd, String createtime, String isDelete) {
        this.managerId = managerId;
        this.managerAcc = managerAcc;
        this.managerPwd = managerPwd;
        this.createtime = createtime;
        this.isDelete = isDelete;
    }

    public Manager() {
    }
}
