package hiveapi.custom;

import hiveapi.utils.ConnectUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logDemo4 {
    public static void LogDemo4(){
        Connection hive_conn= ConnectUtils.getHive_conn();
        Connection mysql_conn=ConnectUtils.getMysql_conn();
        try {
            PreparedStatement ps=hive_conn.prepareStatement("select singer,round(b.b/a.a,2) from\n" +
                    "(select count(*)a from music_log)a,\n" +
                    "(select singer,count(singer)b from music_log group by singer order by b desc limit 10)b");

            ResultSet hive_resultSet =ps.executeQuery();
            while (hive_resultSet.next()){
                PreparedStatement mysql_ps = mysql_conn.prepareStatement("insert into Logdemo4 values (?,?)");
                mysql_ps.setString(1, hive_resultSet.getString(1));
                mysql_ps.setDouble(2, hive_resultSet.getDouble(2));
                mysql_ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LogDemo4();
    }
}
