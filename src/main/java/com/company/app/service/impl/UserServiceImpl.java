package com.company.app.service.impl;

import com.company.app.repository.UserRepository;
import com.company.app.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl() {
        this.userRepository = new UserRepositoryImpl();
    }

    @Override
    public void createUser(String name, String email) {
        User user = new User(name, email);
        userRepository.saveUser(user);
    }
}