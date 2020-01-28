package ru.novikov.service;

import ru.novikov.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User getById(Integer id);
    void save(User user);
    void update(User user);
    void delete(int id);
}
