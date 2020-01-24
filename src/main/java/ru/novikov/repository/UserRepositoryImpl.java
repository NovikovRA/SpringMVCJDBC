package ru.novikov.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.novikov.entity.User;
import ru.novikov.extractor.UserResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.BIGINT;

@Repository
public class UserRepositoryImpl implements UserRepository {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<User> findAll() {
        String sql = "SELECT * FROM fucker";
        return jdbcTemplate.query(sql, userRowMapper);
    }

    public List<User> findAllWithExtractor() {
        return jdbcTemplate.query("SELECT * FROM fucker",
                new Object[]{},
                new int[]{},
                new UserResultSetExtractor()
        );
    }

    @Override
    public List<User> findAllBestPractice() {
        return jdbcTemplate.query("SELECT * FROM fucker ",
                new Object[]{},
                new int[]{},
                new ResultSetExtractor<List<User>>() {
                    @Override
                    public List<User> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                        return extractUsers(resultSet);
                    }
                }
        );
    }

    @Override
    public List<User> findAllLambda() {
        return jdbcTemplate.query("SELECT * FROM fucker ",
                new Object[]{},
                new int[]{},
                resultSet -> {
                    return extractUsers(resultSet);
                });

    }

    @Override
    public User find(Integer id) {
        return jdbcTemplate.query("SELECT * FROM fucker WHERE id = ? OR id = ?",
                new Object[]{id, id},
                new int[]{BIGINT, BIGINT},
                new ResultSetExtractor<User>() {
                    @Override
                    public User extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                       return extractUser(resultSet);
                    }
                }
        );
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
