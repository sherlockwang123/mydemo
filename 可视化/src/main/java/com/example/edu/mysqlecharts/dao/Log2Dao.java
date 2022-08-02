package com.example.edu.mysqlecharts.dao;



import com.example.edu.mysqlecharts.entity.Log2Bean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Mapper
@Component("Log2Mapper")
public interface Log2Dao {

    @Select("select * from Logdemo2")
    List<Log2Bean> findByAll();
}
