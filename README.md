# mydemo
dome


一.工具


idea，maven，MySQL，hive，echarts。


二.项目主要分三个模块：


1.基于springboot前后端分离的音乐网站，使用mysql作为数据库，运用阿里oss对象存储进行文件的访问和存储。


2.数据分析模块主要是调用hiveapi来分析数据并保存到mysql。


3.数据可视化模块主要使用echarts来连接mysql并实现可视化。


三.启动(本地)


1.修改配置文件，对应自己的mysql地址和用户及密码。


2.hiveapi修改hdfs的地址（搭建好Hadoop集群）


3.idea启动


四.云服务器部署(centos7)


1.修改配置文件，对应云服务器mysql地址和用户及密码。


2.hiveapi修改hdfs的云服务器地址（搭建好Hadoop集群）。


3.使用maven的package打包项目上传到云服务器。


4.使用命令nohup java -jar mysqlecharts-0.0.1-SNAPSHOT.jar >>echarts.log 2>&1 &启动jar包。


