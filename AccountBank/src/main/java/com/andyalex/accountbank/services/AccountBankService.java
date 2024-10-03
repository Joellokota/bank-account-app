package com.andyalex.accountbank.services;

import com.andyalex.accountbank.entities.AccountBank;
import com.andyalex.accountbank.repository.AccountBankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountBankService {
    private final AccountBankRepository accountBankRepository;

    public AccountBankService(AccountBankRepository accountBankRepository) {
        this.accountBankRepository = accountBankRepository;
    }

    public List<AccountBank> findAllAccountBanks() {
        return (List<AccountBank>) this.accountBankRepository.findAll();
    }

    public AccountBank findAccountBankById(Long id) {
        return this.accountBankRepository.findById(id).orElse(null);
    }

    public AccountBank findAccountBankByNumber(String number) {
        return this.accountBankRepository.findByAccountNumber(number);
    }

    public AccountBank saveAccountBank(AccountBank accountBank) {
        return this.accountBankRepository.save(accountBank);
    }

    public void saveAccountBankAll(List<AccountBank> listAccounts) {
        this.accountBankRepository.saveAll(listAccounts);
    }
}
