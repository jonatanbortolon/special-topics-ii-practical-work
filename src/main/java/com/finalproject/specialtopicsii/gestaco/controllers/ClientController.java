package com.finalproject.specialtopicsii.gestaco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.finalproject.specialtopicsii.gestaco.exceptions.ClientNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Client;
import com.finalproject.specialtopicsii.gestaco.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<Client>> list() {
        return new ResponseEntity<List<Client>>(clientService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> show(@PathVariable Long id) {
        try {
            return new ResponseEntity<Client>(clientService.getClient(id), HttpStatus.OK);
        } catch (ClientNotFoundException clientNotFoundException) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Client> save(@Validated @RequestBody Client client) {
        return new ResponseEntity<Client>(clientService.save(client), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @Validated @RequestBody Client client) {
        return new ResponseEntity<Client>(clientService.update(id, client), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Client> delete(@PathVariable Long id) {
        try {
            clientService.delete(id);
            return new ResponseEntity<Client>(HttpStatus.OK);
        } catch (ClientNotFoundException clientNotFoundException) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
}
