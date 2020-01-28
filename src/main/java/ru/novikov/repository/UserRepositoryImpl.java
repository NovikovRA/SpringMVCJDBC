package ru.novikov.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.novikov.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<User> findAll() {
        String sql = "SELECT * FROM fucker";
        return jdbcTemplate.query(sql, userRowMapper);
    }


    public User getById(int id) {
        String sql = "SELECT * FROM fucker WHERE id=?";
        return jdbcTemplate.queryForObject(sql, userRowMapper, id);
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("INSERT INTO fucker (name, mail,age) values (?,?,?)",user.getName(),user.getMail(), user.getAge());
    }


    @Override
    public void update(User user) {
        jdbcTemplate.update("UPDATE fucker SET name=?, mail=?, age=? WHERE id=?", user.getName(), user.getMail(), user.getAge(), user.getId());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE from fucker where id=?",id);
    }

    public List<User> extractUsers(ResultSet resultSet) throws SQLException {
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(extractUser(resultSet));
        }
        return users;
    }

    private User extractUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setMail(resultSet.getString("mail"));
        user.setAge(resultSet.getInt("age"));
        return user;
    }

    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            return extractUser(resultSet);
        }
    };



}
