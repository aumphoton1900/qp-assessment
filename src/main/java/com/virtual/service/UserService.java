package com.virtual.service;

import java.util.Optional;

import com.virtual.model.User;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User saveUser(User user);

}
