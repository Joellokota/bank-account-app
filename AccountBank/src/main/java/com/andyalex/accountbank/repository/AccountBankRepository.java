package com.andyalex.accountbank.repository;

import com.andyalex.accountbank.entities.AccountBank;
import org.springframework.data.repository.CrudRepository;

public interface AccountBankRepository extends CrudRepository<AccountBank, Long> {
    AccountBank findByAccountNumber(String accountNumber);
}
