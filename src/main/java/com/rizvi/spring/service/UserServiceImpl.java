package com.rizvi.spring.service;


import com.rizvi.spring.model.User;
import com.rizvi.spring.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUsers() {
        return userDao.fetchAllUsers();
    }

    @Override
    public User fetchUserById(Long id) {
        return userDao.fetchUserById(id);

    }

    @Override
    public boolean deleteUser(Long id) {
        return userDao.deleteUser(id);
    }
}
