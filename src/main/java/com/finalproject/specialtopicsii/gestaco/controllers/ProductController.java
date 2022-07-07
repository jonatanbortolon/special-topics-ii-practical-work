package com.finalproject.specialtopicsii.gestaco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.finalproject.specialtopicsii.gestaco.exceptions.ProductNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Product;
import com.finalproject.specialtopicsii.gestaco.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> list() {
        return new ResponseEntity<List<Product>>(productService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> show(@PathVariable Long id) {
        try {
            return new ResponseEntity<Product>(productService.getProduct(id), HttpStatus.OK);
        } catch (ProductNotFoundException productNotFoundException) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Product> save(@Validated @RequestBody Product product) {
        return new ResponseEntity<Product>(productService.save(product), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @Validated @RequestBody Product product) {
        return new ResponseEntity<Product>(productService.update(id, product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id) {
        try {
            productService.delete(id);
            return new ResponseEntity<Product>(HttpStatus.OK);
        } catch (ProductNotFoundException productNotFoundException) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
}
