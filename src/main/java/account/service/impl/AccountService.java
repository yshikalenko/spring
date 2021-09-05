package account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import account.dao.IAccountRepository;
import account.entity.Account;
import account.service.IAccountService;

@Service
public class AccountService implements IAccountService {
    private IAccountRepository accountRepository;
    public AccountService(@Autowired IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public Account newAccount() {
        return accountRepository.createAccount();
    }
}