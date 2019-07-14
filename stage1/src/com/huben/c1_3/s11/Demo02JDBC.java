package com.huben.c1_3.s11;

import java.sql.*;

public class Demo02JDBC {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
            statement = connection.createStatement();

            String sql = "SELECT * FROM account";
            resultSet = statement.executeQuery(sql);


            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble(3);

                System.out.println(id+"---"+name+"---"+balance);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
