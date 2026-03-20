package com.company.app.controller.impl;

import com.company.app.controller.UserController;
import com.company.app.service.UserService;

public class UserControllerImpl implements UserController {
    private final UserService userService;

    public UserControllerImpl() {
        this.userService = new UserServiceImpl();
    }

    @Override
    public void createUser(String name, String email) {
        userService.createUser(name, email);
    }
}