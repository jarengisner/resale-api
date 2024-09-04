package com.example.resale_site_api.services;

import com.example.resale_site_api.interfaces.UserServiceInterface;
import com.example.resale_site_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    //implement interface methods here
}
