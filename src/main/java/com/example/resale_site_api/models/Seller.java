package com.example.resale_site_api.models;

import com.example.resale_site_api.interfaces.Product;
import com.example.resale_site_api.interfaces.UserInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Seller implements UserInterface {
    private List<SaleProduct> products;

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

    public void addProduct(SaleProduct product){
        this.products.add(product);
    };

    //need to figure out how to remove a product here
    public void removeProduct(String id){
        for(int i=0; i<this.products.size(); i++){
            if(this.products.get(i).getId().equals(id)){
                this.products.remove(i);
            }
        }
    }

    public int getNumberOfListings(){
        return products.size();
    };
}
