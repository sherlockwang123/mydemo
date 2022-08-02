package com.example.edu.mysqlecharts.service.impl;


import com.example.edu.mysqlecharts.dao.Log1Dao;
import com.example.edu.mysqlecharts.dao.Log2Dao;
import com.example.edu.mysqlecharts.entity.Log1Bean;
import com.example.edu.mysqlecharts.entity.Log2Bean;
import com.example.edu.mysqlecharts.service.Log1Service;
import com.example.edu.mysqlecharts.service.Log2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Service
public class Log2ServiceImpl implements Log2Service {

    @Autowired
    Log2Dao log2Dao;

    @Override
    public List<Log2Bean> findLog2Data() {
        return log2Dao.findByAll();
    }
}
