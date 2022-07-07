package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.ClientNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Client;
import com.finalproject.specialtopicsii.gestaco.repositories.ClientRepository;

import java.util.Optional;

@Service
public class ClientService {
    ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClient(Long id) {
        Optional<Client> opt = clientRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new ClientNotFoundException(id);
        }
    }
}