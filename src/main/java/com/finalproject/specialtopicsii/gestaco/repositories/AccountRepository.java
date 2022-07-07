package com.finalproject.specialtopicsii.gestaco.repositories;

import com.finalproject.specialtopicsii.gestaco.models.Account;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(value = "SELECT * FROM accounts where email = ?1", nativeQuery = true)
    Optional<Account> getByEmail(String email);
}
