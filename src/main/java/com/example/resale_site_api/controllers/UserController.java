package com.example.resale_site_api.controllers;

import com.example.resale_site_api.interfaces.UserInterface;
import com.example.resale_site_api.models.Buyer;
import com.example.resale_site_api.models.Seller;
import com.example.resale_site_api.services.BuyerServiceImpl;
import com.example.resale_site_api.services.SellerServiceImpl;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
public class UserController {
    private final SellerServiceImpl sellerService;

    private final BuyerServiceImpl buyerService;


    @Autowired
    public UserController(SellerServiceImpl sellerService, BuyerServiceImpl buyerService){
        this.sellerService = sellerService;
        this.buyerService = buyerService;
    };

    @GetMapping("/sellers/{username}")
    public ResponseEntity<Seller> getSellerByName(@PathVariable String username){
        //get by username
        Seller currentuser = sellerService.getUserByUsername(username);

        if(currentuser != null){
            return ResponseEntity.ok(currentuser);
        }else{
            return ResponseEntity.notFound().build();
        }
    };

    @GetMapping("/sellers/{id}")
    public ResponseEntity<Seller> getSellerById(@PathVariable Long id){
      Seller current = sellerService.getUserById(id);

      if(current != null){
          return ResponseEntity.ok(current);
      }else{
          return ResponseEntity.notFound().build();
      }
    };

    @GetMapping("/buyers/{username}")
    public ResponseEntity<Buyer> getBuyerByName(@PathVariable String username){
        Buyer currentBuyer = buyerService.getUserByUsername(username);

        if(currentBuyer != null){
            return ResponseEntity.ok(currentBuyer);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buyers/{id}")
    public ResponseEntity<Buyer> getBuyerById(@PathVariable Long id){
        Buyer currBuyer = buyerService.getUserById(id);

        if(currBuyer != null){
            return ResponseEntity.ok(currBuyer);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/users")
    public ResponseEntity<UserInterface> createUser(@RequestBody UserInterface newUser){
      UserInterface newUser
    };

}
