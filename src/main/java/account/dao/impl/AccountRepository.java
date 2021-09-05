package account.dao.impl;

import account.dao.IAccountRepository;
import account.entity.Account;

public class AccountRepository implements IAccountRepository {
    static long ids;
    @Override
    public Account createAccount() {
        return new Account(++ids);
    }

}