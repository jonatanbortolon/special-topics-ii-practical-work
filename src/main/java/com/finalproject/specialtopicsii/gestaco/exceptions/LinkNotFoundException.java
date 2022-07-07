package com.finalproject.specialtopicsii.gestaco.exceptions;

public class LinkNotFoundException extends RuntimeException {
    public LinkNotFoundException(Long id) {
        super("Link #" + id + " not found");
    }
}
