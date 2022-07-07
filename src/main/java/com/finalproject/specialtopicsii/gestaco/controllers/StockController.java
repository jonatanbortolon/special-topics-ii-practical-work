package com.finalproject.specialtopicsii.gestaco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.finalproject.specialtopicsii.gestaco.exceptions.StockNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Stock;
import com.finalproject.specialtopicsii.gestaco.services.StockService;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public ResponseEntity<List<Stock>> list() {
        return new ResponseEntity<List<Stock>>(stockService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stock> show(@PathVariable Long id) {
        try {
            return new ResponseEntity<Stock>(stockService.getStock(id), HttpStatus.OK);
        } catch (StockNotFoundException stockNotFoundException) {
            return new ResponseEntity<Stock>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Stock> save(@Validated @RequestBody Stock stock) {
        return new ResponseEntity<Stock>(stockService.save(stock), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Stock> delete(@PathVariable Long id) {
        try {
            stockService.delete(id);
            return new ResponseEntity<Stock>(HttpStatus.OK);
        } catch (StockNotFoundException stockNotFoundException) {
            return new ResponseEntity<Stock>(HttpStatus.NOT_FOUND);
        }
    }
}
