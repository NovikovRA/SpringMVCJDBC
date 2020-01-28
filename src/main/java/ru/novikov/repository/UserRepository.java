package ru.novikov.repository;

import ru.novikov.entity.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User getById(int id);
    void save(User user);
    void update(User user);
    void delete(int id);
}
