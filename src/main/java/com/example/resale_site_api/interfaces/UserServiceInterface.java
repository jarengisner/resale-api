package com.example.resale_site_api.interfaces;

public interface UserServiceInterface {
    UserInterface getUserByUsername(String username);

    UserInterface getUserById(Long id);

    UserInterface createUser(UserInterface user);

    void deleteUser(Long id);

    UserInterface updateUser(UserInterface user);
}
