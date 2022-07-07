package com.finalproject.specialtopicsii.gestaco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.finalproject.specialtopicsii.gestaco.exceptions.ProductSaleNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.ProductSale;
import com.finalproject.specialtopicsii.gestaco.services.ProductSaleService;

import java.util.List;

@RestController
@RequestMapping("/product-sale")
public class ProductSaleController {

    private ProductSaleService productSaleService;

    public ProductSaleController(ProductSaleService productSaleService) {
        this.productSaleService = productSaleService;
    }

    @GetMapping
    public ResponseEntity<List<ProductSale>> list() {
        return new ResponseEntity<List<ProductSale>>(productSaleService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductSale> show(@PathVariable Long id) {
        try {
            return new ResponseEntity<ProductSale>(productSaleService.getProductSale(id), HttpStatus.OK);
        } catch (ProductSaleNotFoundException productSaleNotFoundException) {
            return new ResponseEntity<ProductSale>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ProductSale> save(@Validated @RequestBody ProductSale productSale) {
        return new ResponseEntity<ProductSale>(productSaleService.save(productSale), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductSale> update(@PathVariable Long id, @Validated @RequestBody ProductSale productSale) {
        return new ResponseEntity<ProductSale>(productSaleService.update(id, productSale), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductSale> delete(@PathVariable Long id) {
        try {
            productSaleService.delete(id);
            return new ResponseEntity<ProductSale>(HttpStatus.OK);
        } catch (ProductSaleNotFoundException productSaleNotFoundException) {
            return new ResponseEntity<ProductSale>(HttpStatus.NOT_FOUND);
        }
    }
}
