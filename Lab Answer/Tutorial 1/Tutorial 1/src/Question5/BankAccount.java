package Question5;

public class BankAccount implements Account {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    public int deposit(int deposit) {
        balance += deposit;
        return balance;
    }
    
    public boolean withdraw (int withdraw) {
        if(withdraw<=balance) {
            balance -= withdraw;
            return true;
        } else {
        return false;
    }
    }
}