package huben.test;

import org.junit.Test;
import huben.dao.UserDao;
import huben.domain.User;

public class UserDaoTest {

    @Test
    public void login() {

        User loginUser = new User();
        loginUser.setUsername("李四");
        loginUser.setPassword("654321");

        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);

        System.out.println(user);

    }
}
