package com.example.resale_site_api.repositories;

import com.example.resale_site_api.interfaces.SellerInterface;

import com.example.resale_site_api.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Optional<Seller> findByUsername(String Username);
}
