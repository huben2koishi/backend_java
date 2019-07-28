package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户操作的DAO
 */
public interface UserDao {


    List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);

    void delete(int id);

    User findUserById(int id);

    void updateUser(User user);

    int findTotalCount(Map<String, String[]> condition);

    List<User> findUserByPage(int start, int rows, Map<String, String[]> condition);
}
