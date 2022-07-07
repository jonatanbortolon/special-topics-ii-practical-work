package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.ProductSaleNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.ProductSale;
import com.finalproject.specialtopicsii.gestaco.repositories.ProductSaleRepository;

import java.util.Optional;

@Service
public class ProductSaleService {
    ProductSaleRepository productSaleRepository;

    public ProductSaleService(ProductSaleRepository productSaleRepository) {
        this.productSaleRepository = productSaleRepository;
    }

    public ProductSale getProductSale(Long id) {
        Optional<ProductSale> opt = productSaleRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new ProductSaleNotFoundException(id);
        }
    }
}