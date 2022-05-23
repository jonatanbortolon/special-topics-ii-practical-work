package com.finalproject.specialtopicsii.gestaco.models;

public class Sale {
    private int id;
    private char payment_method;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPayment_method(char payment_method) {
        this.payment_method = payment_method;
    }

    public char getPayment_method() {
        return payment_method;
    }

}
