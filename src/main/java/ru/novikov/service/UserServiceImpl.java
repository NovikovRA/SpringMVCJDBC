package ru.novikov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.novikov.entity.User;
import ru.novikov.repository.UserRepository;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserRepository userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
