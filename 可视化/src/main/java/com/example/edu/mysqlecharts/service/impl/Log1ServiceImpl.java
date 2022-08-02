package com.example.edu.mysqlecharts.service.impl;


import com.example.edu.mysqlecharts.dao.Log1Dao;
import com.example.edu.mysqlecharts.entity.Log1Bean;
import com.example.edu.mysqlecharts.service.Log1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Service
public class Log1ServiceImpl implements Log1Service {

    @Autowired
    Log1Dao log1Dao;

    @Override
    public List<Log1Bean> findLog1Data() {
        return log1Dao.findByAll();
    }
}
