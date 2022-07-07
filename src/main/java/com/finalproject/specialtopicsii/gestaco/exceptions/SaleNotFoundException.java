package com.finalproject.specialtopicsii.gestaco.exceptions;

public class SaleNotFoundException extends RuntimeException {
    public SaleNotFoundException(Long id) {
        super("Sale #" + id + " not found");
    }
}
