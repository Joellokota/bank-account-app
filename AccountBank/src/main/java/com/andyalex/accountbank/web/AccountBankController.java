package com.andyalex.accountbank.web;

import com.andyalex.accountbank.entities.AccountBank;
import com.andyalex.accountbank.services.AccountBankService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountBankController {

    private final AccountBankService accountBankService;
    public AccountBankController(AccountBankService accountBankService) {
        this.accountBankService = accountBankService;
    }
    public List<AccountBank> listAccountBanks() {
        return this.accountBankService.findAllAccountBanks();
    }
}
