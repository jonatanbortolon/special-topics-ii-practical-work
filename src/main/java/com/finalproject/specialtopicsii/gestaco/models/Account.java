package com.finalproject.specialtopicsii.gestaco.models;

import com.finalproject.specialtopicsii.gestaco.models.Account;
import org.springframework.lang.Nullable;

import java.util.Set;

public class Account {
    private int id;
    private String document;
    private String address;
    private @Nullable int account_id;
    private String password;
    private String email;
    private String role;
    private Set<Client> clientes;
    private Set<Sale> sales;
    private Set<Link> links;
    private Set<Product> products;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

