package com.finalproject.specialtopicsii.gestaco.models;

import java.time.LocalDateTime;

public class Link {
    private int id;
    private String slug;
    private String role;
    private LocalDateTime expires_at;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSlug() {
        return slug;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setExpires_at(LocalDateTime expires_at) {
        this.expires_at = expires_at;
    }

    public LocalDateTime getExpires_at() {
        return expires_at;
    }

}
