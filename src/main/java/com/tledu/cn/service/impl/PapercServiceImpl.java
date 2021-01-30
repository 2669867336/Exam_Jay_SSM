package com.tledu.cn.service.impl;

import com.tledu.cn.dao.PapercDao;
import com.tledu.cn.pojo.Paperc;
import com.tledu.cn.service.PapercService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tledu.cn.util.JDK8DateUtil;

import java.util.List;
import java.util.UUID;

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
        paperc.setPapercId(UUID.randomUUID().toString());
        paperc.setCreatetime(JDK8DateUtil.LocalDateTime2String(null,null));
        paperc.setIsDelete("0");
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
        int i=0;
        int mark;

        String papercId = paperc.getPapercId();
        String[] ids = papercId.split(",");
        for (int j=0;j<ids.length;j++){
            String  id=ids[j].replace(",","");
            i = papercDao.papercDelete(id);
        }
        if (i>0){
            mark=1;
        }else{
            mark=0;
        }
        return mark;
    }

    @Override
    public String selectTilte(Paperc paperc) {
        String id=null;
        if (paperc.getPapercTitle()!=""&&paperc.getPapercTitle()!=null){

             id = papercDao.selectTilte(paperc);
        }
        return id;
    }

    @Override
    public int papercAdd1(String id) {
        int mark=0;
        int i = papercDao.papercAdd1(id);
        if (i>0){
            mark=1;
        }
        return mark;
    }

    @Override
    public void papercAddAll(Paperc paperc) {
        String[] titles = paperc.getPapercTitle().split(",");
        for (int i=0;i<titles.length;i++){
            String title=titles[i].replace(",","");
            paperc.setPapercTitle(title);
            String id = papercDao.selectTilte(paperc);
            if (id!=""&&id!=null){
                papercDao.papercAdd1(id);
            }else{
                paperc.setPapercId(UUID.randomUUID().toString());
                paperc.setCreatetime(JDK8DateUtil.LocalDateTime2String(null,null));
                paperc.setIsDelete("0");
                papercDao.papercAdd(paperc);
            }
        }

    }
}
