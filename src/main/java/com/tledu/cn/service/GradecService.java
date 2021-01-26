package com.tledu.cn.service;


import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.pojo.PageInfo;
import com.tledu.cn.pojo.Paperc;

import java.util.List;

public interface GradecService {
    public PageInfo<Paperc> findAllByPage(Integer currentPage, Integer pageSize, String str);
}
