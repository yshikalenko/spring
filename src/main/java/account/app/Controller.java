package account.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import account.service.IAccountService;

@Component
public class Controller {
    @Autowired
    private IAccountService accountService;
    void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
    public String createNewAccount() {
        return accountService.newAccount().toString();
    }
}
