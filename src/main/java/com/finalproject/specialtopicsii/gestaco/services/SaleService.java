package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.SaleNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Sale;
import com.finalproject.specialtopicsii.gestaco.repositories.SaleRepository;

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
}