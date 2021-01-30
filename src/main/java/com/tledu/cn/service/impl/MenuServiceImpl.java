package com.tledu.cn.service.impl;

import com.tledu.cn.dao.MenuDao;
import com.tledu.cn.pojo.Menu;
import com.tledu.cn.service.MenuService;

import com.tledu.cn.util.JDK8DateUtil;
import com.tledu.cn.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.UUID;

/**
 * @author sxwstart
 * @create 2021-01-29-21:36:45
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private RedisUtil redisUtil;


    @Override
    public int menuAdd(Menu menu) {
        int mark;
        Menu menu1 = menuDao.selectTitle(menu);
        System.out.println(menu1);
        if (menu1!=null){
            menu.setMenuId(menu1.getMenuId());
            int i = menuDao.menuAddPlus(menu);
            if (i>0){
                List<Menu> menus = menuDao.menuSelectAll();
                redisUtil.set("menuList",menus);
                mark=1;
            }else{
                mark=0;
            }
        }else {
            if (menu.getMenuName()!=""&&menu.getMenuName()!=null&&
                    menu.getMenuHref()!=""&&menu.getMenuHref()!=null){
                menu.setMenuId(UUID.randomUUID().toString());
                menu.setCreatetime(JDK8DateUtil.LocalDateTime2String(null,null));
                menu.setIsDelete("0");
                int i = menuDao.menuAdd(menu);
                if (i>0){
                    List<Menu> menus = menuDao.menuSelectAll();
                    redisUtil.set("menuList",menus);
                    mark=1;
                }else{
                    mark=0;
                }
            }else{
                mark=0;
            }
        }

        return mark;
    }

    @Override
    public List<Menu> menuSelectAll() {
        List<Menu> menuList = (List<Menu>) redisUtil.get("menuList");
        if (menuList!=null){
            return menuList;
        }else{
            List<Menu> menus = menuDao.menuSelectAll();
            return menus;
        }

    }
    @Override
    public List<Menu> menuSelect() {
        List<Menu> menuList = (List<Menu>) redisUtil.get("menuList");
        if (menuList!=null){
            return menuList;
        }else{
            List<Menu> menus = menuDao.menuSelectAll();
            return menus;
        }

    }
    @Override
    public int menuUpdate(Menu menu) {
        int i = menuDao.menuUpdate(menu);
        if(i>0){
            List<Menu> menus = menuDao.menuSelectAll();
            redisUtil.set("menuList",menus);
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int menuDelete(Menu menu) {
        int i = menuDao.menuDelete(menu);
        if(i>0){
            List<Menu> menus = menuDao.menuSelectAll();
            redisUtil.set("menuList",menus);
            return 1;
        }else{
            return 0;
        }
    }
}
