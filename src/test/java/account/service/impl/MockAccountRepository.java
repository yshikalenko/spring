package account.service.impl;

import account.dao.IAccountRepository;
import account.entity.Account;

public class MockAccountRepository implements IAccountRepository {

    private Account account;
    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public Account createAccount() {
        return account;
    }

}
