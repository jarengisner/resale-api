package com.example.resale_site_api.services;

import com.example.resale_site_api.interfaces.UserInterface;
import com.example.resale_site_api.interfaces.UserServiceInterface;
import com.example.resale_site_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.Optional;

public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    //implement interface methods here
    @Override
    public UserInterface getUserByUsername(String username){
        Optional<UserInterface> userOptional = userRepository.findByUsername(username);
        return userOptional.orElse(null);
    };

    public UserInterface createUser(UserInterface user){
        return userRepository.save(user);
    };

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    };

    public UserInterface updateUser(UserInterface user){
        return userRepository.save(user);
    };
}
