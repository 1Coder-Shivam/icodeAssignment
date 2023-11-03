package com.icodetest.services;

import com.icodetest.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
}
