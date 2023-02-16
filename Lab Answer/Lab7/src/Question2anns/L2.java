package Question2anns;

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number or text for checking: ");
        String input = in.nextLine();
        MyQueue<Character> list = new MyQueue<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            list.enqueue(input.charAt(i));
        }
        String reverse = "";
        while (!list.isEmpty()){
            reverse += list.dequeue();
        }
        if (input.equals(reverse)) System.out.println(input +" is palindrome");
        else System.out.println(input +" is not palindrome");
    }
}
