package com.example.resale_site_api.interfaces;

import java.util.Date;
import java.util.List;

public interface Product {

    public String getId();
    public Double getPrice();

    public String getDescription();

    public Date getListDate();

    //need to create seller information to be able to get a seller info
    //public Seller getSeller();

    public int getQuantity();

    public void setPrice(Double price);

    public void setDescription(String description);

    public void setListDate(Date listDate);

    public void setId(String id);

    public void setQuantity(int quantity);

    public int reduceQuantity();
}
