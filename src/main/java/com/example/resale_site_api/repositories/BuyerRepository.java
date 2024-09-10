package com.example.resale_site_api.repositories;

import com.example.resale_site_api.interfaces.BuyerInterface;
import com.example.resale_site_api.interfaces.SellerInterface;
import com.example.resale_site_api.models.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {
    Optional<Buyer> findByUsername(String Username);
}
