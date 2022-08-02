package com.example.edu.mysqlecharts.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class Log3Bean {
    private String username;
    private int total;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Log3Bean{" +
                "username='" + username + '\'' +
                ", total=" + total +
                '}';
    }
}
