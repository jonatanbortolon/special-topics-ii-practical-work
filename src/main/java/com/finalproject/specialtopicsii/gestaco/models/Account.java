package com.finalproject.specialtopicsii.gestaco.models;

import com.finalproject.specialtopicsii.gestaco.models.Account;
import org.springframework.lang.Nullable;

import java.util.Set;

public class Account {
    private int id;
    private char document;
    private char address;
    private @Nullable int account_id;
    private char password;
    private char email;
    private char role;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDocument(char document) {
        this.document = document;
    }

    public char getDocument() {
        return document;
    }

    public void setAddress(char address) {
        this.address = address;
    }

    public char getAddress() {
        return address;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public char getPassword() {
        return password;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getEmail() {
        return email;
    }

    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }
}

