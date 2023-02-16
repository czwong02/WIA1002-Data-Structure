package question4;

import java.util.ArrayList;
import question3.Account;

public class Account1 extends Account {
    private String name;
    private ArrayList<Transaction> transactions;
    
    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    
    @Override
    public void withdraw(double amount){
        if (amount > this.getBalance()){
            System.out.println("Amount is larger than balance.");
            return;
        }
        this.setBalance(this.getBalance() - amount);
        transactions.add(new Transaction('W', amount, this.getBalance(), "Withdrawal"));
    }
    
    @Override
    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount);
        transactions.add(new Transaction('D', amount, this.getBalance(), "Deposit"));
    }
}