
package Question1;

public class Tester {
    public static void main(String[] args) {
        String[] arr = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue(arr);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println(fruitQ.toString());
        System.out.println("The top item is: " + fruitQ.peek());
        System.out.println("The size of the queue is: " + fruitQ.getSize());
        System.out.println("Deleted: " + fruitQ.dequeue());
        System.out.println("Item in index of position of 2: " + fruitQ.getElement(2));
        System.out.println("Queue consists of Cherry: " + fruitQ.contains("Cherry"));
        System.out.println("Queue consists of Durian: " + fruitQ.contains("Durian"));
        System.out.print("The list is: ");
        while(!fruitQ.isEmpty()) {
            System.out.print(fruitQ.dequeue() + " ");
        }
        System.out.println("");
    }
}
