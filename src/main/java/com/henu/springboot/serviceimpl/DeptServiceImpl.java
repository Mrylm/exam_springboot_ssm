package com.henu.springboot.serviceimpl;

import com.henu.springboot.dao.DeptMapper;
import com.henu.springboot.entity.Dept;
import com.henu.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-10-18 20:26
 */
@Service
public class DeptServiceImpl implements DeptService {
    //注入dao层
    @Autowired
    public DeptMapper deptMapper;


    @Override
    public int insert(Dept dept) {
        return deptMapper.insert(dept);
    }

    @Override
    public Dept queryById(int deptno) {
        return deptMapper.queryById(deptno);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}

