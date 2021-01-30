package com.tledu.cn.pojo;

import java.io.Serializable;

/**
 * @author sxwstart
 * @create 2021-01-29-21:10:23
 */
public class Menu implements Serializable {
    private String menuId;
    private String menuName;
    private String menuHref;
    private String createtime;
    private String isDelete;

    @Override
    public String toString() {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuHref='" + menuHref + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref;
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

    public Menu() {
    }

    public Menu(String menuId, String menuName, String menuHref, String createtime, String isDelete) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuHref = menuHref;
        this.createtime = createtime;
        this.isDelete = isDelete;
    }
}
