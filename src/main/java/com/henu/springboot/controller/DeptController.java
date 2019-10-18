package com.henu.springboot.controller;

import com.henu.springboot.entity.Dept;
import com.henu.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-10-18 20:34
 */
@Controller
public class DeptController {

    @Autowired
    public DeptService service;

    //根据deptno查询
    @RequestMapping("/queryid")
    @ResponseBody
    public Dept queryById(@RequestParam("deptno") Integer deptno){
        return  service.queryById(deptno);
    }

        //插入数据
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert(Dept dept){
        System.out.println(dept);
        int i = service.insert(dept);
        if (i<1){
            return false;
        }
        return true;
    }

    @RequestMapping("/queryall")
    @ResponseBody
    public List<Dept> queryAll(){
        return  service.queryAll();
    }
}

