package com.finalproject.specialtopicsii.gestaco.models;

import java.util.Set;

public class Stock {

    private int id;
    private int quantity;
    private String launch_type;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setLaunch_type(String launch_type) {
        this.launch_type = launch_type;
    }

    public String getLaunch_type() {
        return launch_type;
    }
}

