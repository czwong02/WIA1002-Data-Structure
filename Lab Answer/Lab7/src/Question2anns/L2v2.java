package Question2anns;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L2v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number or text for checking: ");
        String input = in.nextLine();
        String[] asOrderString = input.split("");
        String[] desOrderString = new String[asOrderString.length];
        for (int i = 0; i < desOrderString.length; i++) {
            desOrderString[i] = asOrderString[asOrderString.length - i - 1];
        }
        MyQueue<String> asOrderQueue = new MyQueue<>(asOrderString);
        MyQueue<String> desOrderQueue = new MyQueue<>(desOrderString);

        boolean isPalindrome = true;
        while (!asOrderQueue.isEmpty()){
            if (!asOrderQueue.dequeue().equals(desOrderQueue.dequeue())){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) System.out.println(input + " is Palindrome");
        else System.out.println(input + " is not Palindrome");
    }
}
