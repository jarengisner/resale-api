package com.example.resale_site_api.interfaces;

public interface UserServiceInterface {
    UserInterface getUserByUsername(String username);

    UserInterface createUser(UserInterface user);

    void deleteUser(String username);

    UserInterface updateUser(UserInterface user);
}
