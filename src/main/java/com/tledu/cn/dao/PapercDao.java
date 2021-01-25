package com.tledu.cn.dao;

import com.tledu.cn.pojo.Paperc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-25-11:33:18
 */
@Mapper
public interface PapercDao {
    public int papercAdd(Paperc paperc);
    public List<Paperc> papercSelect(Paperc paperc);
    public int papercDelete(String id);
    public String selectTilte(String title);
    public int papercAdd1(String id);

}
