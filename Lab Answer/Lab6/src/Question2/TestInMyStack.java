package Question2;

public class TestInMyStack {
    private static java.util.Scanner input = new java.util.Scanner(System.in);
    
    
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        while (true) {
            int value = input.nextInt();
            if (value == -1) {
                break;
            }
            stack.push(value);
        }
        
        System.out.println("The size of the stack is: " + stack.getSize());
        System.out.println("The element in the stack: ");
        int i = 1;
        while(!stack.isEmpty()) {
            System.out.println("(" + i + ") " + stack.pop());
            i++;
        }
    }
}
