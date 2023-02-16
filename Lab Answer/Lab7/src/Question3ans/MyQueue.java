package Question3ans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public MyQueue(E[] e){
        Collections.addAll(list ,e);
    }

    public MyQueue(){
    }

    public void enqueue(E e){
        list.add(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public E getElement(int i){
        return list.get(i);
    }

    public E peek(){
        return list.getFirst();
    }

    public int getSize(){
        return list.size();
    }

    public boolean contain(E e){
        return list.contains(e);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue: "+list.toString();
    }

    public void setFirstElement(E e){
        if (isEmpty()) return;
        list.set(0, e);
    }
}
