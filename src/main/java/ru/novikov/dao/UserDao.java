package ru.novikov.dao;

import ru.novikov.Entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
