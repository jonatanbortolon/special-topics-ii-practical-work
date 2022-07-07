package com.finalproject.specialtopicsii.gestaco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.finalproject.specialtopicsii.gestaco.exceptions.AccountNotFoundException;
import com.finalproject.specialtopicsii.gestaco.exceptions.AccountWrongPasswordException;
import com.finalproject.specialtopicsii.gestaco.models.Account;
import com.finalproject.specialtopicsii.gestaco.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/login")
    public ResponseEntity<Long> login(@Validated @RequestBody String email, @Validated @RequestBody String password) {
        try {
            return new ResponseEntity<Long>(accountService.login(email, password), HttpStatus.OK);
        } catch (AccountNotFoundException accountNotFoundException) {
            return new ResponseEntity<Long>(HttpStatus.NOT_FOUND);
        } catch (AccountWrongPasswordException accountWrongPasswordException) {
            return new ResponseEntity<Long>(HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<Long> register(@Validated @RequestBody Account account) {
        return new ResponseEntity<Long>(accountService.save(account).getId(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> show(@PathVariable Long id) {
        try {
            return new ResponseEntity<Account>(accountService.getAccount(id), HttpStatus.OK);
        } catch (AccountNotFoundException accountNotFoundException) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }
    }
}
