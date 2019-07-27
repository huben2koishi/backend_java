package huben.dao;

import huben.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import huben.utils.DruidUtils;

public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());

    public User login(User loginUser) {

        try {
            String sql = "SELECT * FROM learn.user0 where username=? AND password=?";

            return template.queryForObject(
                    sql,
                    (rs, i) -> {
                        int id = rs.getInt("id");
                        String username = rs.getString("username");
                        String password = rs.getString("password");

                        return new User(id,username,password);
                    },
                    loginUser.getUsername(),
                    loginUser.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
