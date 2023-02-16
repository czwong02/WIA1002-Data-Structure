package SList;

public class SNode<E> {
    E element;
    SNode<E> next;
    SNode<E> prev;

    public SNode(E element, SNode<E> next, SNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
    public SNode(E element) {
        this(element, null, null);
    }
}