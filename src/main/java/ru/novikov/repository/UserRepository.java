package ru.novikov.repository;

import ru.novikov.entity.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    List<User> findAllWithExtractor();
    List<User> findAllBestPractice();
    List<User> findAllLambda();
    User find(Integer id);
}
