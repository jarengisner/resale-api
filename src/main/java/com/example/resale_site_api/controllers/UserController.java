package com.example.resale_site_api.controllers;

import com.example.resale_site_api.interfaces.UserInterface;
import com.example.resale_site_api.services.UserServiceImpl;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class UserController {
    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService){
        this.userService=userService;
    };

    @GetMapping("/users/{username}")
    public ResponseEntity<UserInterface> getUserByName(@PathVariable String username){
        //get by username
        UserInterface currentuser = userService.getUserByUsername(username);

        if(currentuser != null){
            return ResponseEntity.ok(currentuser);
        }else{
            return ResponseEntity.notFound().build();
        }
    };

    @GetMapping("/users/{id}")
    public ResponseEntity<UserInterface> getUserById(@PathVariable Long id){
      UserInterface current = userService.getUserById(id);

      if(current != null){
          return ResponseEntity.ok(current);
      }else{
          return ResponseEntity.notFound().build();
      }
    };


}
