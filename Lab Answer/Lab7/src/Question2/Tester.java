package Question2;

import java.util.LinkedList;
import java.util.Scanner;

public class Tester {
  LinkedList queue = new LinkedList();
  LinkedList stack = new LinkedList();

  // Stack/*from   w w  w.  jav  a  2  s . c  o  m*/
  public void pushCharacter(char ch) {
    stack.push(ch);
  }

  public char popCharacter() {
    return (char) stack.pop();
  }

  // Queue
  public void enqueueCharacter(char ch) {
    queue.addLast(ch);
  }

  public char dequeueCharacter() {
    return (char) queue.remove(0);
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
      System.out.println("Please enter a text for checking: ");
    String input = inp.nextLine();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Tester p = new Tester();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length / 2; i++) {
      if (p.popCharacter() != p.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }

    // Finally, print whether string s is palindrome or not.
    System.out.println(input + " is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
  }
}