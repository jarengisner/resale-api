package com.example.resale_site_api.models;

import com.example.resale_site_api.interfaces.Product;
import com.example.resale_site_api.interfaces.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Seller implements UserInterface {
    private List<Product> products;

    private String username;

    private String password;

    private String bio;

    public Seller(String username, String password, String bio){
        this.username = username;
        this.password=password;
        this.bio=bio;

        this.products = new ArrayList<>();
    };

    @Override
    public String getUsername(){
        return this.username;
    };
    @Override
    public String getPassword(){
        return this.password;
    };
    @Override
    public String getBio(){
        return this.bio;
    };


    //setters

    public void setUsername(String username){
        this.username = username;
    };

    public void setPassword(String password){
        this.password = password;
    };

    public void setBio(String bio){
        this.bio = bio;
    };

    public void addProduct(Product product){
        this.products.add(product);
    };

    //need to figure out how to remove a product here

}
