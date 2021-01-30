package com.tledu.cn.dao;

import com.tledu.cn.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-29-21:13:25
 */
@Mapper
public interface MenuDao {
    public int menuAdd(Menu menu);
    public List<Menu> menuSelectAll();
    public int menuUpdate(Menu menu);
    public int menuDelete(Menu menu);
    public Menu selectTitle(Menu menu);
    public int menuAddPlus(Menu menu);
}
