package SList;

import java.util.NoSuchElementException;

public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;
    
    public SList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public void appendEnd(E e) {
        SNode<E> temp = new SNode(e, null, tail);
        if(tail != null) { tail.next = temp; }
        tail = temp;
        if(head == null) { head = temp; }
        size++;
        System.out.println("Appending: " + e);
    }
    
    public E removeInitial() {
        if (size == 0) throw new NoSuchElementException();
        SNode<E> tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("Remove: " + tmp.element);
        return tmp.element;
    }
    
    public boolean contain(E e) {
        SNode<E> temp = head;
        while(temp!=null) {
            if(temp.element.equals(e)) return true;
            temp = temp.next;
        }
        return false;
    }
    
    public void clear() {
        SNode<E> temp = head;
        while (head != null) {
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
    }
    
    public void display() {
        SNode<E> cur = head;
        while(cur != null){
            System.out.print(cur.element + " ");
            cur = cur.next;
        }
        System.out.println("");
    }
}