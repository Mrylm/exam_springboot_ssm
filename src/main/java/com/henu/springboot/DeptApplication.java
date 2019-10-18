package com.henu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shkstart
 * @create 2019-10-18 19:53
 */
@SpringBootApplication
@ComponentScan(basePackages ="com.henu.springboot" )
@MapperScan("com.henu.springboot.dao")
public class DeptApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(DeptApplication.class,args);
    }

}

