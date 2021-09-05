package account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import account.app.Controller;
import account.dao.IAccountRepository;
import account.dao.impl.AccountRepository;
import account.service.IAccountService;
import account.service.impl.AccountService;

@Configuration
public class ContextConfig {

    @Bean
    public Controller controller() {
        Controller controller = new Controller();
        controller.setAccountService(accountService());
        return controller;
    }

    @Bean
    public IAccountService accountService() {
        return new AccountService(accountRepository());
    }

    @Bean
    public IAccountRepository accountRepository() {
        return new AccountRepository();
    }
    
}
