package com.example.edu.mysqlecharts.dao;


import com.example.edu.mysqlecharts.entity.Log3Bean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component("Log3Mapper")
public interface Log3Dao {

    @Select("select * from Logdemo3")
    List<Log3Bean> findByAll();
}
