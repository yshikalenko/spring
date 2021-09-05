package account.dao.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountRepositoryTest {
    
    private AccountRepository accountRepository;

    @Before
    public void setUp() throws Exception {
        accountRepository = new AccountRepository();
    }

    @Test
    public void test() {
        assertEquals("The first account shoulde be created with id ", 1L, 
                accountRepository.createAccount().getId());
        assertEquals("An account shoulde be created with ballance ", 0.0, 
                accountRepository.createAccount().getBalance(), 0.0001);
    }

}
