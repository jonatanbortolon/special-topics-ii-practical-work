package com.finalproject.specialtopicsii.gestaco.models;

public class ProductSale {
    private int quantity;
    private Sale sale;
    private Product product;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
