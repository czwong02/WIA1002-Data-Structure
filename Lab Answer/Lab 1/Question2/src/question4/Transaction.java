package question4;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private Date date = new Date();
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    } 
    
    @Override
    public String toString() {
        return "date: " + date + "\ntype: " + type + "\namount: RM" + amount + "\nbalance: RM" + balance + "\ndescription: " + description + "\n";
    }
}