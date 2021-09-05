package account.service.impl;

import account.dao.IAccountRepository;
import account.entity.Account;
import account.service.IAccountService;

public class AccountService implements IAccountService {
    private IAccountRepository accountRepository;
    public AccountService(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public Account newAccount() {
        return accountRepository.createAccount();
    }
}