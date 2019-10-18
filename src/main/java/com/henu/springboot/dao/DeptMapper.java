package com.henu.springboot.dao;

import com.henu.springboot.entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-10-18 20:18
 */
@Repository
public interface DeptMapper {
     public int insert(Dept dept);
     public Dept queryById(int deptno);
     public List<Dept> queryAll();

}

