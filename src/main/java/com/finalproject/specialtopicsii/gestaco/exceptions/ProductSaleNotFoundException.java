package com.finalproject.specialtopicsii.gestaco.exceptions;

public class ProductSaleNotFoundException extends RuntimeException {
    public ProductSaleNotFoundException(Long id) {
        super("ProductSale #" + id + " not found");
    }
}
