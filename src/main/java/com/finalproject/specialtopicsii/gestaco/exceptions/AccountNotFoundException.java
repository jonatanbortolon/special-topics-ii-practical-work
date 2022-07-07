package com.finalproject.specialtopicsii.gestaco.exceptions;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(Long id) {
        super("Account #" + id + " not found");
    }
}
