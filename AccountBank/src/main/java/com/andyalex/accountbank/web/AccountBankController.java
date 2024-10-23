package com.andyalex.accountbank.web;

import com.andyalex.accountbank.clients.CustomerRestClient;
import com.andyalex.accountbank.entities.AccountBank;
import com.andyalex.accountbank.models.Customer;
import com.andyalex.accountbank.services.AccountBankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AccountBankController {

    private final AccountBankService accountBankService;
    private  final CustomerRestClient customerRestClient;
    public AccountBankController(AccountBankService accountBankService, CustomerRestClient customerRestClient) {
        this.accountBankService = accountBankService;
        this.customerRestClient = customerRestClient;
    }

    @GetMapping("list-accounts")
    public List<AccountBank> listAccountBanks() {
        List<AccountBank> accountBanks = this.accountBankService.findAllAccountBanks();
        for (AccountBank accountBank : accountBanks) {
            Customer customer = this.customerRestClient.getCustomer(accountBank.getCustomerID());
            accountBank.setCustomer(customer);
        }
        return accountBanks;
    }

    @GetMapping("list-accounts/{id}")
    public AccountBank findAccountBankById(long id) {
        AccountBank accountBank = this.accountBankService.findAccountBankById(id);
        Customer customer = this.customerRestClient.getCustomer(accountBank.getCustomerID());
        accountBank.setCustomer(customer);
        return accountBank;
    }
}
