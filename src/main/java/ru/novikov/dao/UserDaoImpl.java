package ru.novikov.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.novikov.Entity.User;
import ru.novikov.mapper.UserMapper;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<User> findAll() {
        String sql = "SELECT * FROM fucker";
        return jdbcTemplate.query(sql, new UserMapper());
    }


}
