package account.app;

import account.entity.Account;
import account.service.IAccountService;

public class MockService implements IAccountService {

    private Account account;

    @Override
    public Account newAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    

}
