package com.huben.c1_3.s11;

//import java.io.FileReader;
//import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {

    private static String url = "jdbc:mysql://localhost:3306/learn";
    private static String user = "root";
    private static String password = "root";
    private static String driver = "com.mysql.cj.jdbc.Driver";


    static {
        Properties prop = new Properties();
        try {
//            prop.load(new FileReader("stage1/src/com/huben/c1_3/s11/jdbc.properties"));
//            url = prop.getProperty("url");
//            user = prop.getProperty("user");
//            password = prop.getProperty("password");
//            driver = prop.getProperty("driver");

            Class.forName(driver);
        } catch (/*IOException | */ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);

    }


    public static void closeResource(Statement statement, Connection connection) {
        closeStatement(statement);
        closeConnection(connection);
    }

    public static void closeResource(ResultSet resultSet, Statement statement, Connection connection) {
        closeResultSet(resultSet);
        closeStatement(statement);
        closeConnection(connection);
    }

    private static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        resultSet = null;
    }

    private static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        statement = null;
    }

    private static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        connection = null;
    }
}
