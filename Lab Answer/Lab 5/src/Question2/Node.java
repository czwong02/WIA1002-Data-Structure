package Question2;

public class Node<E> {
    E element;
    Node<E> next;
    
    public Node(){
    }
    
    public Node(E o) {
        element = o;
    }
}