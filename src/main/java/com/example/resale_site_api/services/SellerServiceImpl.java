package com.example.resale_site_api.services;

import com.example.resale_site_api.interfaces.UserInterface;
import com.example.resale_site_api.interfaces.UserServiceInterface;
import com.example.resale_site_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//NEED TO IMPLEMENT A SELLERSERVICEINTERFACE
public class SellerServiceImpl implements SellerServiceInterface {

    /*
    * THIS ENTIRE PAGE NEEDS TO REFACTOR TO HOLD A SELLERREPOSITORY
    * */

    @Autowired
    private UserRepository userRepository;

    //implement interface methods here
    @Override
    public UserInterface getUserByUsername(String username){
        Optional<UserInterface> userOptional = userRepository.findByUsername(username);
        return userOptional.orElse(null);
    };

    @Override
    public UserInterface getUserById(Long id){
        Optional<UserInterface> user = userRepository.findById(id);

        return user.orElse(null);
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
