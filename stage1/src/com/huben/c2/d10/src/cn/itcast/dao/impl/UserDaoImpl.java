package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库...
        //1.定义sql
        String sql = "select * from learn.user";

        return template.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        try {
            String sql = "select * from learn.user where `username`=? and `password`=?";
            return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void add(User user) {
        String sql = "insert into learn.user(name, gender, age, address, qq, email, username, password) VALUES (?,?,?,?,?,?,null,null)";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from learn.user where id=?";
        template.update(sql, id);
    }

    @Override
    public User findUserById(int id) {
        try {
            String sql = "select * from learn.user where `id`=?";
            return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateUser(User user) {
        String sql = "update learn.user set name=?, gender=?, age=?, address=? ,qq=? ,email=? where id=?";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        String sql = "select count(*) from learn.user where 1=1";
        StringBuilder builder = new StringBuilder(sql);
        ArrayList<Object> params = new ArrayList<>();

        for (String key : condition.keySet()) {
            if ("currentPage".equals(key)||"rows".equals(key)){
                continue;
            }
            String value = condition.get(key)[0];
            if (value != null && !"".equals(value)) {
                params.add("%"+value+"%");
                builder.append(" and ").append(key).append(" like ?");
            }
        }
        sql = builder.toString();

        return template.queryForObject(sql, Integer.class, params.toArray());
    }

    @Override
    public List<User> findUserByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from learn.user where 1=1";
        StringBuilder builder = new StringBuilder(sql);

        ArrayList<Object> params = new ArrayList<>();

        for (String key : condition.keySet()) {
            if ("currentPage".equals(key)||"rows".equals(key)){
                continue;
            }
            String value = condition.get(key)[0];
            if (value != null && !"".equals(value)) {
                params.add("%"+value+"%");
                builder.append(" and ").append(key).append(" like ?");
            }
        }

        params.add(start);
        params.add(rows);

        builder.append(" limit ?, ?");
        sql = builder.toString();

        return template.query(sql, new BeanPropertyRowMapper<>(User.class), params.toArray());

    }
}
