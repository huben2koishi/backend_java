package com.huben.c1_3.s11;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

public class Demo05Druid {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();

        prop.load(Demo05Druid.class.getClassLoader().getResourceAsStream("druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }
}
