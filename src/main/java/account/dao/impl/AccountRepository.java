package account.dao.impl;

import org.springframework.stereotype.Repository;

import account.dao.IAccountRepository;
import account.entity.Account;

@Repository
public class AccountRepository implements IAccountRepository {
    static long ids;
    @Override
    public Account createAccount() {
        return new Account(++ids);
    }

}