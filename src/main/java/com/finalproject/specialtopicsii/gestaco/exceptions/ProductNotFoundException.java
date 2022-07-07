package com.finalproject.specialtopicsii.gestaco.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Product #" + id + " not found");
    }
}
