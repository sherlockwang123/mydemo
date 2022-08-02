package com.example.edu.mysqlecharts.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class Log2Bean {
    private String singer;
    private int total;


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Log2Bean{" +
                "singer='" + singer + '\'' +
                ", total=" + total +
                '}';
    }
}
