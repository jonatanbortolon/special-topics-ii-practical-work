package com.finalproject.specialtopicsii.gestaco.exceptions;

public class AccountWrongPasswordException extends RuntimeException {
    public AccountWrongPasswordException() {
        super("Wrong password");
    }
}
