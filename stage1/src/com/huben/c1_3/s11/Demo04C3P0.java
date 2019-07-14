package com.huben.c1_3.s11;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo04C3P0 {
    public static void main(String[] args) {
        DataSource source = new ComboPooledDataSource();
        Connection connection = null;
        try {
            connection = source.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(connection);
    }
}
