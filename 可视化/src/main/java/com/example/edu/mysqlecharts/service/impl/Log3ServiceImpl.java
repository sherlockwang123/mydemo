package com.example.edu.mysqlecharts.service.impl;



import com.example.edu.mysqlecharts.dao.Log3Dao;
import com.example.edu.mysqlecharts.entity.Log3Bean;
import com.example.edu.mysqlecharts.service.Log3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Service
public class Log3ServiceImpl implements Log3Service {

    @Autowired
    Log3Dao log3Dao;

    @Override
    public List<Log3Bean> findLog3Data() {
        return log3Dao.findByAll();
    }
}
