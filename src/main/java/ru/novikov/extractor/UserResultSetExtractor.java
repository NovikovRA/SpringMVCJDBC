package ru.novikov.extractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import ru.novikov.entity.User;
import ru.novikov.repository.UserRepositoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserResultSetExtractor implements ResultSetExtractor<List<User>> {
    @Autowired
    private UserRepositoryImpl repository;

    public List<User> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        return repository.extractUsers(resultSet);
    }
}

