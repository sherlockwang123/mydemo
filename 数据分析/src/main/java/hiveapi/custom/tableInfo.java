package hiveapi.custom;

import hiveapi.utils.ConnectUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class tableInfo {

    public static void mkTable(){
        Connection hive_conn=ConnectUtils.getHive_conn();
        try {
            PreparedStatement ps=hive_conn.prepareStatement("create external table log(json string)\n"+"location '/logs'");
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mkTable1(){
        Connection hive_conn=ConnectUtils.getHive_conn();
        try {
            PreparedStatement ps=hive_conn.prepareStatement("create table music_log as\n" +
                    "select json_tuple(json,'mlSinger','mlSongname','times','userId','userName')\n" +
                    "as (singer,song,times,userid,username) from log");
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //mkTable();
        mkTable1();
    }
}
