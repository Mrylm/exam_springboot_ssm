package com.henu.springboot.service;

import com.henu.springboot.entity.Dept;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-10-18 20:22
 */
public interface DeptService {
    //添加数据
    public int insert(Dept dept);
    //根据deptno查询
    public Dept queryById(int deptno);
    //查询全部
    public List<Dept> queryAll();


}
