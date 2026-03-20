package com.company.app;

import com.company.app.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserControllerImpl();
        userController.createUser("John Doe", "johndoe@example.com");
    }
}