package com.finalproject.specialtopicsii.gestaco.models;

import com.finalproject.specialtopicsii.gestaco.models.Account;
import org.springframework.lang.Nullable;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String document;
    private String address;
    private @Nullable int account_id;
    private String password;
    private String email;
    private String role;
    @OneToMany
    @JoinColumn(name = "account_id")
    private Set<Account> accounts;
    @OneToMany
    @JoinColumn(name = "account_id")
    private Set<Client> clientes;
    @OneToMany
    @JoinColumn(name = "account_id")
    private Set<Sale> sales;
    @OneToMany
    @JoinColumn(name = "account_id")
    private Set<Link> links;
    @OneToMany
    @JoinColumn(name = "account_id")
    private Set<Product> products;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
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

