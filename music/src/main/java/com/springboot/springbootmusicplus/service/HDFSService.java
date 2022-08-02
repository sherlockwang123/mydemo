package com.springboot.springbootmusicplus.service;

public interface HDFSService {
    //吧json数据追加到hdfs集群
    void dataToHDFS(String line);
}
