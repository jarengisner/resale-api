package com.example.resale_site_api.interfaces;

import com.example.resale_site_api.models.Buyer;
import com.example.resale_site_api.models.Seller;

public interface BuyerServiceInterface {
    Buyer getUserByUsername(String username);

    Buyer getUserById(Long id);

    Buyer createUser(Buyer user);

    void deleteUser(Long id);

    Buyer updateUser(Buyer user);
}
