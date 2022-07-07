package com.finalproject.specialtopicsii.gestaco.exceptions;

public class StockNotFoundException extends RuntimeException {
    public StockNotFoundException(Long id) {
        super("Stock #" + id + " not found");
    }
}
