package com.huben.c1_3.s11;

import java.sql.*;
import java.util.Scanner;

public class Test03JDBCUtils {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();

        Connection connection = null;
//        Statement statement = connection.createStatement();
//        String sql = "SELECT * FROM user WHERE name='" + name + "' AND password = '" + password+"'";
        String sql = "SELECT * FROM user WHERE name= ? AND password = ? ";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("登录成功");
            } else {
                System.out.println("用户名或密码错误!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(resultSet, preparedStatement, connection);
        }


    }
}
