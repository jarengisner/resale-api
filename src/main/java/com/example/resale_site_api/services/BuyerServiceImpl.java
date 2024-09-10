package com.example.resale_site_api.services;

import com.example.resale_site_api.interfaces.BuyerInterface;
import com.example.resale_site_api.interfaces.BuyerServiceInterface;
import com.example.resale_site_api.interfaces.UserInterface;

import com.example.resale_site_api.models.Buyer;
import com.example.resale_site_api.repositories.BuyerRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//NEED TO IMPLEMENT A BUYERSERVICEINTERFACE
public class BuyerServiceImpl implements BuyerServiceInterface {

    @Autowired
    private BuyerRepository buyerRepository;

    //implement interface methods here
    @Override
    public Buyer getUserByUsername(String username){
        Optional<Buyer> userOptional = buyerRepository.findByUsername(username);
        return userOptional.orElse(null);
    };

    @Override
    public Buyer getUserById(Long id){
        Optional<Buyer> user = buyerRepository.findById(id);

        return user.orElse(null);
    };

    public Buyer createUser(Buyer user){
        return buyerRepository.save(user);
    };

    public void deleteUser(Long id){
        buyerRepository.deleteById(id);
    };

    public Buyer updateUser(Buyer user){
        return buyerRepository.save(user);
    };
}
