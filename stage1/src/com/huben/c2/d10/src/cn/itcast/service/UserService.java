package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    List<User> findAll();

    User login(User user);

    void addUser(User user);

    void deleteUser(int id);

    User findUser(int id);

    void updateUser(User user);

    void deleteSelectedUsers(String[] uids);

    PageBean<User> findUserByPage(String currentPage, String rows, Map<String,String[]> condition);
}
