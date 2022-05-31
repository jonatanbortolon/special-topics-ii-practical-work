package com.finalproject.specialtopicsii.gestaco.models;

import java.util.Set;

public class Product {

    private int id;
    private String name;
    private int price;
    private Set<Stock> stocks;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
