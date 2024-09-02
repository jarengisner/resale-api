package com.example.resale_site_api.models;

import com.example.resale_site_api.interfaces.Product;

import java.util.Date;

public class SaleProduct implements Product {
    private String id;

    private Double price;

    private String description;

    private Date listDate;

    public SaleProduct(String id, Double price, String description, Date listDate){
        this.id = id;
        this.price = price;
        this.description = description;
        this.listDate=listDate;
    };

    public String getId(){
        return this.id;
    };

    public Double getPrice(){
        return this.price;
    };

    public String getDescription(){
        return this.description;
    };

    public Date getListDate(){
        return this.listDate;
    };

    //setters

    public void setId(String id){
        this.id = id;
    };

    public void setPrice(Double price){
        this.price = price;
    };

    public void setDescription(String description){
        this.description = description;
    };

    public void setListDate(Date listDate){
        this.listDate = listDate;
    };
}
