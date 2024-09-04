package com.example.resale_site_api.models;

import com.example.resale_site_api.interfaces.Product;

import java.util.Date;

public class SaleProduct implements Product {
    private String id;

    private Double price;

    private String description;

    private Date listDate;

    private int quantity;

    public SaleProduct(String id, Double price, String description, Date listDate, int quantity){
        this.id = id;
        this.price = price;
        this.description = description;
        this.listDate=listDate;
        this.quantity=quantity;
    };

    @Override
    public String getId(){
        return this.id;
    };

    @Override
    public Double getPrice(){
        return this.price;
    };

    @Override
    public String getDescription(){
        return this.description;
    };

    @Override
    public Date getListDate(){
        return this.listDate;
    };

    @Override
    public int getQuantity(){return this.quantity;};

    //setters

    @Override
    public void setId(String id){
        this.id = id;
    };


    @Override
    public void setPrice(Double price){
        this.price = price;
    };

    @Override
    public void setDescription(String description){
        this.description = description;
    };

    @Override
    public void setListDate(Date listDate){
        this.listDate = listDate;
    };

    @Override
    public void setQuantity(int quantity){
        this.quantity=quantity;
    };


    @Override
    public int reduceQuantity(){
        int currentQuantity = this.quantity;

        currentQuantity--;

        this.quantity=currentQuantity;

        return this.quantity;
    }

}
