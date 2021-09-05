package account.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import account.entity.Account;

public class AccountServiceTest {
    
    private AccountService accountService;
    private MockAccountRepository repository; 

    @Before
    public void setUp() throws Exception {
        repository = new MockAccountRepository();
        accountService = new AccountService(repository);
    }

    @Test
    public void test() {
        Account account = new Account(1L);
        repository.setAccount(account);
        assertEquals(account, accountService.newAccount());
    }

}
