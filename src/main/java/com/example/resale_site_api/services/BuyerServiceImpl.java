package com.example.resale_site_api.services;

import com.example.resale_site_api.interfaces.BuyerInterface;
import com.example.resale_site_api.interfaces.UserInterface;

import com.example.resale_site_api.repositories.BuyerRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//NEED TO IMPLEMENT A BUYERSERVICEINTERFACE
public class BuyerServiceImpl implements BuyerServiceInterface {

    @Autowired
    private BuyerRepository buyerRepository;

    //implement interface methods here
    @Override
    public UserInterface getUserByUsername(String username){
        Optional<UserInterface> userOptional = buyerRepository.findByUsername(username);
        return userOptional.orElse(null);
    };

    @Override
    public UserInterface getUserById(Long id){
        Optional<UserInterface> user = buyerRepository.findById(id);

        return user.orElse(null);
    };

    public UserInterface createUser(BuyerInterface user){
        return buyerRepository.save(user);
    };

    public void deleteUser(Long id){
        buyerRepository.deleteById(id);
    };

    public UserInterface updateUser(BuyerInterface user){
        return buyerRepository.save(user);
    };
}
