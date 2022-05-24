package com.finalproject.specialtopicsii.gestaco.models;

public class Sale {
    private int id;
    private String payment_method;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method() {
        return payment_method;
    }

}
