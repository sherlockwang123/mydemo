package com.example.edu.mysqlecharts.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class Log1Bean {
    private String song;
    private int total;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Log1Bean{" +
                "song='" + song + '\'' +
                ", total=" + total +
                '}';
    }
}
