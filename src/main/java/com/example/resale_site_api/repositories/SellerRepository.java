package com.example.resale_site_api.repositories;

import com.example.resale_site_api.interfaces.SellerInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<SellerInterface, Long> {
    Optional<SellerInterface> findByUsername(String Username);
}
