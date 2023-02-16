package Question4;

public class Stack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public boolean isPalindrome(String text) {
        for(int i = 0; i <text.length()/2; i++) {
            if(text.charAt(i)==text.charAt(text.length()-1-i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Is it a palindrome: " + stack.isPalindrome("qweewq"));
    }
}