package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.ClientNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Client;
import com.finalproject.specialtopicsii.gestaco.repositories.ClientRepository;

import java.util.List;
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

    public List<Client> list() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Long id, Client client) {
        return clientRepository.save(client);
    }

    public void delete(Long id) {
        try {
            clientRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new ClientNotFoundException(id);
        }
    }
}