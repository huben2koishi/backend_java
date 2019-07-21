package huben.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

public class DruidUtils {
    private static DataSource dataSource;

    static {
        Properties prop = new Properties();
        try {
            prop.load(Objects.requireNonNull(DruidUtils.class.getClassLoader().getResourceAsStream("druids.properties")));
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
