package com.tledu.cn.service;

import com.tledu.cn.pojo.Paper;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-23-10:10:12
 */
public interface PaperService {

    public int paperInsert(Paper paper);
    public int paperDelete(Paper paper);
    public List<Paper> paperSelectAll();
    public int paperUpdate(Paper paper);
    public int paperUpdateStatus(Paper paper);




}
