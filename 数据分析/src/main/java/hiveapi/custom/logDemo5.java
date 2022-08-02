package hiveapi.custom;

import hiveapi.utils.ConnectUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logDemo5 {
    public static void LogDemo5(){
        Connection hive_conn= ConnectUtils.getHive_conn();
        Connection mysql_conn=ConnectUtils.getMysql_conn();
        try {
            PreparedStatement ps=hive_conn.prepareStatement("select d.cbsong from    \n" +
                    "(select c.bsong as cbsong,count(*)counts from\n" +
                    "(select b.username as busername,b.song as bsong from \n" +
                    "(select username,count(distinct song)counts from music_log \n" +
                    "group by username order by counts desc limit 6)a\n" +
                    "join music_log b on a.username=b.username\n" +
                    "group by b.username,b.song)c\n" +
                    "group by c.bsong)d\n" +
                    "where counts=6");

            ResultSet hive_resultSet =ps.executeQuery();
            while (hive_resultSet.next()){
                PreparedStatement mysql_ps = mysql_conn.prepareStatement("insert into Logdemo5 values (?)");
                mysql_ps.setString(1, hive_resultSet.getString(1));
                mysql_ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

}

    public static void main(String[] args) {
        LogDemo5();
    }
}
