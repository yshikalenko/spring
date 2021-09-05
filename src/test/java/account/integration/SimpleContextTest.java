package account.integration;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import account.app.Controller;
import account.entity.Account;

public class SimpleContextTest {

    @Test
    public void test() {
        try (AbstractXmlApplicationContext context = new FileSystemXmlApplicationContext("context/applicationContext.xml")) {
            Controller controller = context.getBean("controller", Controller.class);
            Account account = new Account(1);
            assertEquals(account.toString(), controller.createNewAccount());
        }
    }

}
