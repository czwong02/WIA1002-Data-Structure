
package Question3;

public class Queue {
    static class Node {
        int share, price; 
        Node next;
    
        public Node(int share, int price) {
        this.share = share;
        this.price = price;
        this.next = null;
        }
    }
    
    private Node head, tail;
    public Queue() {
    this.head = null;
    this.tail = null;
    }
    
    public void enqueue(int share, int price) {
        Node newNode = new Node(share, price);
        if (this.tail == null) {
            this.head = this.tail = newNode;
            return;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }
    
    public void dequeue() {
        if (this.head == null) {
            return;
        }
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
    }
    
    public Node peek() {
        return this.head;
    }
}
