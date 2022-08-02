package com.example.edu.mysqlecharts.service.impl;


import com.example.edu.mysqlecharts.dao.Log4Dao;
import com.example.edu.mysqlecharts.entity.Log4Bean;
import com.example.edu.mysqlecharts.service.Log4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Service
public class Log4ServiceImpl implements Log4Service {

    @Autowired
    Log4Dao log4Dao;

    @Override
    public List<Log4Bean> findLog4Data() {
        return log4Dao.findByAll();
    }
}
