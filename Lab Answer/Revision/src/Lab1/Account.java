
package Lab1;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account() {
        dateCreated = new Date();
        id = 0;
        balance = 0;
        annualInterestRate  = 0;
    }

    public Account(int id, double balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }
    
    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }
    
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Amount is larger than balance.");
            return;
        }
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
