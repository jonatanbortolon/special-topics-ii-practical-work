package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.StockNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Stock;
import com.finalproject.specialtopicsii.gestaco.repositories.StockRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {
    StockRepository StockRepository;

    public StockService(StockRepository StockRepository) {
        this.StockRepository = StockRepository;
    }

    public Stock getStock(Long id) {
        Optional<Stock> opt = StockRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new StockNotFoundException(id);
        }
    }

    public List<Stock> list() {
        return StockRepository.findAll();
    }

    public Stock save(Stock Stock) {
        return StockRepository.save(Stock);
    }

    public Stock update(Long id, Stock Stock) {
        return StockRepository.save(Stock);
    }

    public void delete(Long id) {
        try {
            StockRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new StockNotFoundException(id);
        }
    }
}