package com.huben.c1_3.s11;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class Demo06JDBCTemplate {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());

        String sql = "UPDATE account SET balance=3000 WHERE id=?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }

    private static JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());

    @Test
    public void test1() {
        String sql = "SELECT * FROM emp WHERE id=?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
    }

    @Test
    public void test2() {
        String sql = "SELECT * FROM emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    @Test
    public void test3() {
        String sql = "SELECT * FROM emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joinDate = rs.getDate("joinDate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                return new Emp(id, ename, job_id, mgr, joinDate, salary, bonus, dept_id);
            }
        });

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void test4() {
        String sql = "SELECT * FROM emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void test5() {
        String sql = "SELECT COUNT(id) FROM emp";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }

}
