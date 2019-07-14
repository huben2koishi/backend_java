package com.huben.c1_3.s11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01JDBC {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
            statement = connection.createStatement();

            String sql = "INSERT INTO account VALUES(NULL,'王二',2000)";
            int i = statement.executeUpdate(sql);
            System.out.println(i);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
        }

    }
}
