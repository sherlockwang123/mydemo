package com.example.edu.mysqlecharts.entity;


import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class Value_Name {
    private List<String> name;
    private List<Integer> value;


    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<Integer> getValue() {
        return value;
    }

    public void setValue(List<Integer> value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Value_Name{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }
}
