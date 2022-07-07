package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.ProductSaleNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.ProductSale;
import com.finalproject.specialtopicsii.gestaco.repositories.ProductSaleRepository;

import java.util.List;
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

    public List<ProductSale> list() {
        return productSaleRepository.findAll();
    }

    public ProductSale save(ProductSale productSale) {
        return productSaleRepository.save(productSale);
    }

    public ProductSale update(Long id, ProductSale productSale) {
        return productSaleRepository.save(productSale);
    }

    public void delete(Long id) {
        try {
            productSaleRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new ProductSaleNotFoundException(id);
        }
    }
}