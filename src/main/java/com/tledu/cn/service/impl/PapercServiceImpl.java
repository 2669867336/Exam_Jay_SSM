package com.tledu.cn.service.impl;

import com.tledu.cn.dao.PapercDao;
import com.tledu.cn.pojo.Paperc;
import com.tledu.cn.service.PapercService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-25-12:00:55
 */
@Service
public class PapercServiceImpl implements PapercService {

    @Autowired
    private PapercDao papercDao;

    @Override
    public int papercAdd(Paperc paperc) {
        int mark;
        int i = papercDao.papercAdd(paperc);
        if (i>0){
            mark=1;
        }else{
            mark=0;
        }

        return mark;
    }

    @Override
    public List<Paperc> papercSelect(Paperc paperc) {
        List<Paperc> papercs = papercDao.papercSelect(paperc);
        return papercs;
    }

    @Override
    public int papercDelete(Paperc paperc) {

        int mark;

        int i = papercDao.papercDelete(paperc);
        if (i>0){
            mark=1;
        }else{
            mark=0;
        }
        return mark;
    }
}