package com.tledu.cn.service.impl;

import com.tledu.cn.dao.YuejuanDao;
import com.tledu.cn.pojo.Gradec;
import com.tledu.cn.service.YuejuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YuejuanImpl implements YuejuanService {
    @Autowired
    private YuejuanDao yuejuanDao;

    @Override
    public List<Gradec> selectYuejuan(Gradec gradec) {
        List<Gradec> gradecs = yuejuanDao.selectYuejuan(gradec);
        return gradecs;
    }
}
