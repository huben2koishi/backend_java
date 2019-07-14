package com.huben.c1_3.s11;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class Test02JDBC {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Emp> emps = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
            statement = connection.createStatement();

            String sql = "SELECT * FROM emp";
            resultSet = statement.executeQuery(sql);

            Emp emp = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joinDate = resultSet.getDate("joinDate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");

                emp = new Emp(id, ename, job_id, mgr, joinDate, salary, bonus, dept_id);
                emps.add(emp);

                //System.out.println(id + "-" + name + "-" + job_id + "-" + mgr + "-" + joinDate + "-" + salary + "-" + bonus + "-" + dept_id);
            }

            for (Emp e : emps) {
                System.out.println(e);
            }

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
