package com.finalproject.specialtopicsii.gestaco.models;

import java.util.Set;

import org.springframework.lang.Nullable;

public class Client {
    private int id;
    private String name;
    private @Nullable String phone;
    private @Nullable String email;
    private String document;
    private Set<Sale> sales;

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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }
}
