package com.finalproject.specialtopicsii.gestaco.models;

import org.springframework.lang.Nullable;

public class Client {
    private int id;
    private char name;
    private @Nullable char phone;
    private @Nullable char email;
    private char document;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public void setPhone(char phone) {
        this.phone = phone;
    }

    public char getPhone() {
        return phone;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getEmail() {
        return email;
    }

    public void setDocument(char document) {
        this.document = document;
    }

    public char getDocument() {
        return document;
    }
}
