package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.AccountNotFoundException;
import com.finalproject.specialtopicsii.gestaco.exceptions.AccountWrongPasswordException;
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

    public Long login(String email, String password) {
        Optional<Account> opt = accountRepository.getByEmail(email);

        if (opt.isPresent()) {
            Account account = opt.get();

            if (account.getPassword() == password) {
                return opt.get().getId();
            } else {
                throw new AccountWrongPasswordException();
            }
        } else {
            throw new AccountNotFoundException(email);
        }
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }
}