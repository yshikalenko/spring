package account.entity;

public class Account {
    private final long id;
    double balance;
    
    public Account(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account [id=" + id + ", balance=" + balance + "]";
    }
    
}
