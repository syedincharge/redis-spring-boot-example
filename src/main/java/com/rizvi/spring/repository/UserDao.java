package com.rizvi.spring.repository;


import com.rizvi.spring.model.User;

import java.util.List;

public interface UserDao {

    boolean saveUser(User user);

    List<User> fetchAllUsers();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);
}
