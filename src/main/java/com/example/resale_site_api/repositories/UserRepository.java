package com.example.resale_site_api.repositories;

import com.example.resale_site_api.interfaces.UserInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInterface, Long> {
    Optional<UserInterface> findByUsername(String Username);
}
