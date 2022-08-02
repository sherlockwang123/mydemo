package com.springboot.springbootmusicplus.service.impl;

import com.springboot.springbootmusicplus.dao.HDFSDao;
import com.springboot.springbootmusicplus.service.HDFSService;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.Properties;

@Service
public class HDFSServiceImpl implements HDFSService {

    @Autowired
    HDFSDao hdfsDao;

    @Override
    public void dataToHDFS(String line) {
        FileSystem fileSystem=hdfsDao.getFileSystem();
        //Properties properties=hdfsDao.getProperties();
        //
        FSDataOutputStream outputStream;
        try {
            if (fileSystem.exists(new Path("hdfs://121.41.55.156:9000/logs/"+"music.log"))){
                outputStream=fileSystem.append(new Path("hdfs://121.41.55.156:9000/logs/"+"music.log"));
            }else {
                outputStream=fileSystem.create(new Path("hdfs://121.41.55.156:9000/logs/"+"music.log"));
            }

            IOUtils.copyBytes(org.apache.commons.io.IOUtils.toInputStream(line+"\r\n"),outputStream,hdfsDao.getConfiguration(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
