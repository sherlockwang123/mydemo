package com.example.edu.mysqlecharts.service;




import com.example.edu.mysqlecharts.entity.Log4Bean;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public interface Log4Service {

    /**
     * 查找所有用户的yewu
     */
    List<Log4Bean> findLog4Data();
}
