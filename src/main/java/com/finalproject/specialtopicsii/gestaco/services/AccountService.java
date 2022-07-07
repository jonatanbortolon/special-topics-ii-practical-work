package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.AccountNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Account;
import com.finalproject.specialtopicsii.gestaco.repositories.AccountRepository;

import java.util.Optional;

@Service
public class AccountService {
    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccount(Long id) {
        Optional<Account> opt = accountRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new AccountNotFoundException(id);
        }
    }
}