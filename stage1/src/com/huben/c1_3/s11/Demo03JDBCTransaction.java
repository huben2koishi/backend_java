package com.huben.c1_3.s11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo03JDBCTransaction {
    public static void main(String[] args) {
        Connection connection = null;
        String sql1 = "UPDATE account SET balance = balance-? WHERE id = ?";
        String sql2 = "UPDATE account SET balance = balance+? WHERE id = ?";
        PreparedStatement preparedStatement1= null;
        PreparedStatement preparedStatement2= null;
        ResultSet resultSet1 = null;
        ResultSet resultSet2 = null;


        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);

            preparedStatement1.setDouble(1, 500);
            preparedStatement1.setInt(2, 1);
            preparedStatement2.setDouble(1, 500);
            preparedStatement2.setInt(2, 2);

            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();
        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.commit();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBCUtils.closeResource(preparedStatement1, connection);
            JDBCUtils.closeResource(preparedStatement2, null);
        }


    }
}
