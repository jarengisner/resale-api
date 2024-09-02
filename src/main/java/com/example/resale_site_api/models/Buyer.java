package com.example.resale_site_api.models;

import com.example.resale_site_api.interfaces.UserInterface;

public class Buyer implements UserInterface {

    private String username;

    private String password;

    private String bio;

    public Buyer(String username, String password, String bio){
        this.username=username;
        this.password=password;
        this.bio=bio;
    };

    @Override
    public String getUsername() {
        return this.username;
    };

    @Override
    public String getPassword() {
        return this.password;
    };

    @Override
    public String getBio() {
        return this.bio;
    };

    public void setUsername(String username) {
        this.username = username;
    };

    public void setPassword(String password) {
        this.password = password;
    };

    public void setBio(String bio) {
        this.bio = bio;
    };
}
