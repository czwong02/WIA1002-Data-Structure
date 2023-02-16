package question4;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Account1 user = new Account1("George", 1122, 1000);
        user.setAnnualInterestRate(1.5);
        user.deposit(30);
        user.deposit(40);
        user.deposit(50);
        user.withdraw(5);
        user.withdraw(4);
        user.withdraw(2);
        
        System.out.println("Name: " + user.getName());
        System.out.println("Monthly interest rate: RM" + user.getMonthlyInterestRate());
        System.out.println("Balance: RM" + user.getBalance());
        
        ArrayList<Transaction> temp = user.getTransactions();
        
        System.out.println("\nList of transactions: ");
        for(Transaction t: temp) {
            System.out.println(t.toString());
        }
    }
}