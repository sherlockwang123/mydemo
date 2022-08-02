package com.example.edu.mysqlecharts.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class Log4Bean {
    private String singer;
    private float scale;


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "Log4Bean{" +
                "singer='" + singer + '\'' +
                ", scale=" + scale +
                '}';
    }
}
