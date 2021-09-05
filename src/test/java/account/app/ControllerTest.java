package account.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import account.entity.Account;

public class ControllerTest {
    
    private Controller controller;
    private MockService sevice;

    @Before
    public void setUp() throws Exception {
        sevice = new MockService();
        controller = new Controller();
        controller.setAccountService(sevice);
    }

    @Test
    public void test() {
        Account account = new Account(1);
        sevice.setAccount(account);
        assertEquals(account.toString(), controller.createNewAccount());
    }

}
