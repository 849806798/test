package com.example.test.Util;

import java.sql.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SqlUtils {
    private static final String DRIVERCLASS;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        DRIVERCLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        URL ="jdbc:sqlserver://171.35.121.29:1433;DatabaseName=SOTO_MIS8_HQS" ;
        USERNAME = "leding";
        PASSWORD = "ledingkeji";
    }

    static {
        try {
            Class.forName(DRIVERCLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {

        // 2.获取连接
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        return con;
    }

    // 关闭操作
    public static void closeConnection(Connection con) throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public static void closeStatement(Statement st) throws SQLException {
        if (st != null) {
            st.close();
        }
    }

    public static void closeResultSet(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }

    public static ResultSet rs(String selectsql, List<Object> param){

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs=null;

        try{
            connection = SqlUtils.getConnection();
            List<Object> params = param;
            statement=connection.prepareStatement(selectsql);
            for(int i=0;i<params.size();i++){
                statement.setObject(i+1,params.get(i));
            }
            rs = statement.executeQuery();

        }catch (Exception e){
            System.out.printf("获取数据异常:", e);
        }finally {
            try {
                SqlUtils.closeConnection(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }
}


