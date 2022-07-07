package com.finalproject.specialtopicsii.gestaco.exceptions;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(Long id) {
        super("Client #" + id + " not found");
    }
}
