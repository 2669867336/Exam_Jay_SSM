package com.tledu.cn.service;

import com.tledu.cn.pojo.Menu;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-29-21:36:02
 */
public interface MenuService {
    public int menuAdd(Menu menu);
    public List<Menu> menuSelectAll();
    public List<Menu> menuSelect();
    public int menuUpdate(Menu menu);
    public int menuDelete(Menu menu);
}
