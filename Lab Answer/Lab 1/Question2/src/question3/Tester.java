package question3;

public class Tester {
    public static void main(String[] args) {
        Account user = new Account(1122, 20000);
        user.setAnnualInterestRate(4.5);
        user.withdraw(2500);
        user.deposit(3000);
        System.out.printf("Balance: $%.2f%n", user.getBalance());
        System.out.printf("Monthly interest: $%.2f%n", user.getMonthlyInterest());
        System.out.println("Date created: " + user.getDateCreated());
    }
}