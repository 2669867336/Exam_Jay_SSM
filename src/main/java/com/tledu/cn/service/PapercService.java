package com.tledu.cn.service;

import com.tledu.cn.pojo.Paperc;

import java.util.List;

/**
 * @author sxwstart
 * @create 2021-01-25-11:53:01
 */
public interface PapercService {
    public int papercAdd(Paperc paperc);
    public List<Paperc> papercSelect(Paperc paperc);
    public int papercDelete(Paperc paperc);
}
