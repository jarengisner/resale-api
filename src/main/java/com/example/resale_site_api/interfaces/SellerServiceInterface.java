package com.example.resale_site_api.interfaces;

import com.example.resale_site_api.models.Seller;

public interface SellerServiceInterface {
    Seller getUserByUsername(String username);

    Seller getUserById(Long id);

    Seller createUser(Seller user);

    void deleteUser(Long id);

    Seller updateUser(Seller user);
}
