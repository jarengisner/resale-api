package com.example.resale_site_api.services;

import com.example.resale_site_api.interfaces.SellerServiceInterface;
import com.example.resale_site_api.models.Seller;
import com.example.resale_site_api.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//NEED TO IMPLEMENT A SELLERSERVICEINTERFACE
public class SellerServiceImpl implements SellerServiceInterface {

    /*
    * THIS ENTIRE PAGE NEEDS TO REFACTOR TO HOLD A SELLERREPOSITORY
    * */

    @Autowired
    private SellerRepository sellerRepository;

    //implement interface methods here
    @Override
    public Seller getUserByUsername(String username){
        Optional<Seller> userOptional = sellerRepository.findByUsername(username);
        return userOptional.orElse(null);
    };

    @Override
    public Seller getUserById(Long id){
        Optional<Seller> user = sellerRepository.findById(id);

        return user.orElse(null);
    };

    public Seller createUser(Seller user){
        return sellerRepository.save(user);
    };

    public void deleteUser(Long id){
        sellerRepository.deleteById(id);
    };

    public Seller updateUser(Seller user){
        return sellerRepository.save(user);
    };
}
