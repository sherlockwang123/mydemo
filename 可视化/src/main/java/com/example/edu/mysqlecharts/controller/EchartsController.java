package com.example.edu.mysqlecharts.controller;


import com.example.edu.mysqlecharts.entity.*;
import com.example.edu.mysqlecharts.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Controller
public class EchartsController {

    @Autowired
    Log1Service log1Service;

    @Autowired
    Log2Service log2Service;

    @Autowired
    Log3Service log3Service;

    @Autowired
    Log4Service log4Service;



    @RequestMapping("/charts/log1")
    public String getLog1(){
       return "charts/bar";
    }


    @RequestMapping("/charts/log2")
    public String getLog2(){
        return "charts/line";
    }


    @RequestMapping("/charts/log3")
    public String getLog3(){
        return  "charts/line2";
    }

    @RequestMapping("/charts/log4")
    public String getLog4(){
        return  "charts/pie";
    }



    /**
     * 从数据库中获取数据
     */
    @RequestMapping("/charts/getLog1Data")
    @ResponseBody
    public NamesAndValues getLog1Data(){
        //eharts需要的实体类
        NamesAndValues namesAndValues = new NamesAndValues();
        //创建
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        //从mysql获取数据
        List<Log1Bean> log1Beans = log1Service.findLog1Data();
        //
        for (Log1Bean log1Bean : log1Beans) {
            names.add(log1Bean.getSong());
            values.add(log1Bean.getTotal());
        }
        //赋值
        namesAndValues.setNames(names);
        namesAndValues.setValues(values);

        return namesAndValues;
    }



    @RequestMapping("/charts/getLog2Data")
    @ResponseBody
    public ValueName getLog2Data(){
        //创建一个echarts中饼状图需要的数据
        ValueName valueName = new ValueName();
        //创建
        ArrayList<String> names1 = new ArrayList<>();
        ArrayList<Integer> values1 = new ArrayList<>();
        //从mysql获取数据
        List<Log2Bean> log2Beans = log2Service.findLog2Data();
        //
        for (Log2Bean log2Bean : log2Beans) {
            names1.add(log2Bean.getSinger());
            values1.add(log2Bean.getTotal());
        }
        //赋值
        valueName.setName(names1);
        valueName.setValue(values1);

        return valueName;
    }

    @RequestMapping("/charts/getLog3Data")
    @ResponseBody
    public Value_Name getLog3Data(){
        //创建一个echarts中饼状图需要的数据
        Value_Name value_Name = new Value_Name();
        //创建
        ArrayList<String> names2 = new ArrayList<>();
        ArrayList<Integer> values2 = new ArrayList<>();
        //从mysql获取数据
        List<Log3Bean> log3Beans = log3Service.findLog3Data();
        //
        for (Log3Bean log3Bean : log3Beans) {

            names2.add(log3Bean.getUsername());
            values2.add(log3Bean.getTotal());
        }
        //赋值
        value_Name.setName(names2);
        value_Name.setValue(values2);

        return value_Name;
    }

    @RequestMapping("/charts/getLog4Data")
    @ResponseBody
    public List<ValueName1> getLog4Data() {

        ArrayList<ValueName1> valueName1 = new ArrayList<>();

        //从mysql获取数据
        List<Log4Bean> log4Beans = log4Service.findLog4Data();

        for (Log4Bean log4Bean : log4Beans) {
           ValueName1 valueName= new ValueName1();
           valueName.setName(log4Bean.getSinger());
           valueName.setValue(log4Bean.getScale());
            valueName1.add(valueName);
        }

        return valueName1;
    }


}
