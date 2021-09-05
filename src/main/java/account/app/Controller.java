package account.app;

import account.service.IAccountService;

public class Controller {
    private IAccountService accountService;
    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
    public String createNewAccount() {
        return accountService.newAccount().toString();
    }
    
}
