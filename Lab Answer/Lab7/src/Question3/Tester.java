
package Question3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        CapGain capGain = new CapGain();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your query (In format \'Buy / Sell x shares at $y each\'): ");
            String statement = input.nextLine();
            String[] arr = statement.split(" ");
            if(arr[0].equalsIgnoreCase("Buy")) {
                System.out.println("Buying now...");
                int shares = Integer.parseInt(arr[1]);
                int price = Integer.parseInt(arr[4].replace("$",""));
                capGain.buy(shares, price);
            } else if(arr[0].equalsIgnoreCase("Sell")) {
                System.out.println("Selling the shares now...");
                int shares = Integer.parseInt(arr[1]);
                int price = Integer.parseInt(arr[4].replace("$",""));
                capGain.sell(shares, price);
                System.out.println("Total Capital Gain: " + capGain.getTotalCapGain());
            } else if(statement.equalsIgnoreCase("")) {
                System.out.println("Final Capital Gain / Loss: " + capGain.getTotalCapGain());
                break;
            } else {
                System.out.println("Invalid query. Please enter correct query");
            }
        }
        
    }
}
