package com.example.resale_site_api.Utility;

import com.example.resale_site_api.interfaces.UserInterface;
import com.example.resale_site_api.models.Buyer;
import com.example.resale_site_api.models.Seller;

public class UserFactory {

    //need to associate 1 or 2 with a buyer or a seller
    //seller just has more permissions to list
    public UserInterface generateUser(String type, String username, String password, String bio){
        if(type == "SELLER"){
            return new Seller(username, password, bio);
        }else{
            return new Buyer(username, password, bio);
        }
    };
}
