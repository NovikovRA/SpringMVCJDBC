package ru.novikov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.novikov.Entity.User;
import ru.novikov.dao.UserDao;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
