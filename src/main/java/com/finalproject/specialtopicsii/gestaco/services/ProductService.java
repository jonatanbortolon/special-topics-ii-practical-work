package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.ProductNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Product;
import com.finalproject.specialtopicsii.gestaco.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(Long id) {
        Optional<Product> opt = productRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new ProductNotFoundException(id);
        }
    }

    public List<Product> list() {
        return productRepository.findAll();
    }

    public Product save(Product client) {
        return productRepository.save(client);
    }

    public Product update(Long id, Product client) {
        return productRepository.save(client);
    }

    public void delete(Long id) {
        try {
            productRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new ProductNotFoundException(id);
        }
    }
}