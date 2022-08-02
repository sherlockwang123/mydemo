package com.springboot.springbootmusicplus.dao;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.util.Properties;

@Service
public class HDFSDao {
    static FileSystem fileSystem;
    //static Properties properties;
    static Configuration configuration;

    static {
        //properties=new Properties();
        //try {
            //properties.load(HDFSDao.class.getClassLoader().getResourceAsStream("application.yml"));
        //} catch (IOException e) {
            //e.printStackTrace();
        //}
        configuration = new Configuration();
        configuration.set("dfs.client.block.write.replace-datanode-on-failure.enable","true");
        configuration.set("dfs.client.block.write.replace-datanode-on-failure.policy","NEVER");
        configuration.set("dfs.client.use.datanode.hostname","true");
        try {
            fileSystem = FileSystem.get(URI.create("hdfs://121.41.55.156:9000"), configuration, "root");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }


    public FileSystem getFileSystem(){

        return fileSystem;
    }

    //public Properties getProperties(){
        //return properties;
    //}

    public  Configuration getConfiguration(){
        return configuration;
    }
}