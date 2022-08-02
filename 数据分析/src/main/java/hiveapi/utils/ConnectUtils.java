package hiveapi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectUtils {

    static Connection hive_conn;
    static Connection mysql_conn;

    static {
        try {
            Properties properties=new Properties();
            properties.load(ConnectUtils.class.getClassLoader().getResourceAsStream("application.properties"));
            Class.forName(properties.getProperty("mysql.data.driver"));
            Class.forName(properties.getProperty("hive.data.driver"));
            hive_conn= DriverManager.getConnection(properties.getProperty("hive.data.url"), properties.getProperty("hive.data.username"), properties.getProperty("hive.data.password"));
            mysql_conn= DriverManager.getConnection(properties.getProperty("mysql.data.url"), properties.getProperty("mysql.data.username"), properties.getProperty("mysql.data.password"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getHive_conn(){
        return hive_conn;

    }

    public static Connection getMysql_conn(){
        return mysql_conn;

    }
}
