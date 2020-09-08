package com.myhopu.atoz.Util;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcUtil {
    private static Connection connection = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://120.79.68.233:3306/job_db?useUnicode=true&characterEncoding=UTF-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "19971116ch");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void executeUpdate(String sql, Object[] params) {
        try {
            ps = connection.prepareStatement(sql);
            if (params != null && params.length != 0) {
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i + 1, params[i]);
                }
            }
            ps.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void releaseDB() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e2) {
            // TODO: handle exception
            e2.printStackTrace();
        }
    }

    public static List<Map<String, Object>> executeQuery(String sql, Object[] params) {
        ResultSet rs = null;
        List<Map<String, Object>> list = new ArrayList<>();

        try {
            ps = getConnection().prepareStatement(sql);
            if (params != null && params.length != 0) {
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i + 1, params[i]);
                }
            }
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            while (rs.next()) {
                Map<String, Object> map = new HashMap<>();
                for (int i = 0; i < columnCount; i++) {
                    String columnName = rsmd.getColumnLabel(i + 1);
                    Object columnValue = rs.getObject(i + 1);
                    //System.out.println(columnName + "===>" + columnValue);
                    map.put(columnName, columnValue);
                }
                list.add(map);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }
}