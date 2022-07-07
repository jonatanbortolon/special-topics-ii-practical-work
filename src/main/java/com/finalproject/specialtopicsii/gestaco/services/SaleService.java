package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.SaleNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Sale;
import com.finalproject.specialtopicsii.gestaco.repositories.SaleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {
    SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public Sale getSale(Long id) {
        Optional<Sale> opt = saleRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new SaleNotFoundException(id);
        }
    }

    public List<Sale> list() {
        return saleRepository.findAll();
    }

    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    public Sale update(Long id, Sale sale) {
        return saleRepository.save(sale);
    }

    public void delete(Long id) {
        try {
            saleRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new SaleNotFoundException(id);
        }
    }
}