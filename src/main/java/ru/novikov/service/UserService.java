package ru.novikov.service;

import ru.novikov.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
