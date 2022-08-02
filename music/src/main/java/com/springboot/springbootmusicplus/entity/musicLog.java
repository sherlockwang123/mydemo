package com.springboot.springbootmusicplus.entity;

public class musicLog {
    private Integer userId;
    private String userName;
    private String mlSongname;
    private String mlSinger;
    private String times;

    public musicLog(Integer userId, String userName, String mlSongname, String mlSinger, String times){
        this.userId= userId;
        this.userName=userName;
        this.mlSongname=mlSongname;
        this.mlSinger=mlSinger;
        this.times=times;
    }

    public Integer getUserId(){
        return userId;
    }
    public void setUserid(Integer userId){
        this.userId=userId;
    }
    public String getUserName(){
        return userName;
    }
    public void setUsername(String userNameName){
        this.userName=userName;
    }
    public String getMlSongname(){
        return mlSongname;
    }
    public void setSong(String mlSongname){
        this.mlSongname=mlSongname;
    }
    public String getMlSinger(){
        return mlSinger;
    }
    public void setSinger(String mlSinger){
        this.mlSinger=mlSinger;
    }
    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
    @Override
    public String toString() {
        return "musicLog{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", mlSongname=" + mlSongname +
                ", mlSinger='" + mlSinger + '\'' +
                ", times='" + times + '\'' +
                '}';
    }
}
