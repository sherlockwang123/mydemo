package com.example.edu.mysqlecharts.dao;



import com.example.edu.mysqlecharts.entity.Log4Bean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component("Log4Mapper")
public interface Log4Dao {

    @Select("select * from Logdemo4")
    List<Log4Bean> findByAll();
}
