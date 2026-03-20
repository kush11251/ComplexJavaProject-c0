package com.company.app.repository;

import com.company.app.model.User;

public interface UserRepository {
    void saveUser(User user);
}