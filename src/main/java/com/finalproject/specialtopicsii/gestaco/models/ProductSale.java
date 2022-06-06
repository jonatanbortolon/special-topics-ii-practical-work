package com.finalproject.specialtopicsii.gestaco.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductSale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int quantity;
    @ManyToOne
    private Sale sale;
    @ManyToOne
    private Product product;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
