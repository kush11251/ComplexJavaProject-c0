package com.company.app.repository.impl;

import com.company.app.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void saveUser(com.company.app.model.User user) {
        System.out.println("Saving user: " + user.getName() + " - " + user.getEmail());
    }
}