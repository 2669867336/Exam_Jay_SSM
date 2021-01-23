package com.tledu.cn.dao;

import com.tledu.cn.pojo.Paper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-23-10:11:16
 */
@Mapper
public interface PaperDao {
    public int paperInsert(Paper paper);
    public int paperDelete(Paper paper);
    public List<Paper> paperSelectAll();
    public int paperUpdate(Paper paper);
    public int paperUpdateStatus(Paper paper);

}
