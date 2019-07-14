package com.huben.c1_3.s11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01JDBC {
    public static void main(String[] args) throws Exception {
        // 注册驱动, 5.0版本后可省略
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 获取数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");

        // sql 语句
        String sql = "UPDATE account SET balance = 500 WHERE id = 1";

        // 获取 sql 执行对象
        Statement statement = connection.createStatement();

        // 执行 sql
        int count = statement.executeUpdate(sql);
        System.out.println(count);

        statement.close();
        connection.close();
    }
}
