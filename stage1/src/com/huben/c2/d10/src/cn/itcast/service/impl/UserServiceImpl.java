package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(int id) {
        dao.delete(id);
    }

    @Override
    public User findUser(int id) {
        return dao.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void deleteSelectedUsers(String[] uids) {
        if (uids != null && uids.length > 0) {
            for (String uid : uids) {
                dao.delete(Integer.parseInt(uid));
            }
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String,String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        PageBean<User> bean = new PageBean<>();

        bean.setCurrentPage(currentPage);
        bean.setRows(rows);

        int totalCount = dao.findTotalCount(condition);
        bean.setTotalCount(totalCount);

        int totalPage = totalCount / rows == 0 ? totalCount / rows : totalCount / rows + 1;
        bean.setTotalPage(totalPage);

        int start = (currentPage - 1) * rows;
        List<User> user = dao.findUserByPage(start, rows, condition);
        bean.setList(user);

        return bean;
    }

}
