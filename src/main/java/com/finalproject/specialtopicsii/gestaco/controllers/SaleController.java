package com.finalproject.specialtopicsii.gestaco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.finalproject.specialtopicsii.gestaco.exceptions.SaleNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Sale;
import com.finalproject.specialtopicsii.gestaco.services.SaleService;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    private SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public ResponseEntity<List<Sale>> list() {
        return new ResponseEntity<List<Sale>>(saleService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sale> show(@PathVariable Long id) {
        try {
            return new ResponseEntity<Sale>(saleService.getSale(id), HttpStatus.OK);
        } catch (SaleNotFoundException saleNotFoundException) {
            return new ResponseEntity<Sale>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Sale> save(@Validated @RequestBody Sale sale) {
        return new ResponseEntity<Sale>(saleService.save(sale), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sale> update(@PathVariable Long id, @Validated @RequestBody Sale sale) {
        return new ResponseEntity<Sale>(saleService.update(id, sale), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Sale> delete(@PathVariable Long id) {
        try {
            saleService.delete(id);
            return new ResponseEntity<Sale>(HttpStatus.OK);
        } catch (SaleNotFoundException saleNotFoundException) {
            return new ResponseEntity<Sale>(HttpStatus.NOT_FOUND);
        }
    }
}
