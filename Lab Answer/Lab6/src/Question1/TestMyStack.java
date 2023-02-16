package Question1;

public class TestMyStack {
    
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.toString());
        System.out.println("Element \'b\' is in the stack: " + stack.search('b'));
        System.out.println("Element \'k\' is in the stack: " + stack.search('k'));
        System.out.println("");
        
        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.toString());
        System.out.println("Element \'6\' is in the stack: " + stack2.search(6));

    }
}