package ru.novikov.service;

import ru.novikov.Entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
