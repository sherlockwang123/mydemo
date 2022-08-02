package hiveapi.custom;

import hiveapi.utils.ConnectUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logDemo3 {
    public static void LogDemo3() {
        Connection hive_conn = ConnectUtils.getHive_conn();
        Connection mysql_conn = ConnectUtils.getMysql_conn();
        try {
            PreparedStatement ps = hive_conn.prepareStatement("select username,count(username)as a from music_log group by username order by a desc limit 5");

            ResultSet hive_resultSet = ps.executeQuery();
            while (hive_resultSet.next()) {
                PreparedStatement mysql_ps = mysql_conn.prepareStatement("insert into Logdemo3 values (?,?)");
                mysql_ps.setString(1, hive_resultSet.getString(1));
                mysql_ps.setInt(2, hive_resultSet.getInt(2));
                mysql_ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LogDemo3();
    }
}