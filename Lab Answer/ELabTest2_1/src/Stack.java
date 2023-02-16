
import java.util.ArrayList;

public class Stack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    private java.util.ArrayList<E> line = new java.util.ArrayList<>();
    private String stack_name;

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }
    
    public void push(E o) {
        list.add(o);
    }
    
    public void push(E o1, E o2) {
        line.add(o1);
        line.add(o2);
        list.add((E) line);
    }
    
    public void push(E o1, E o2, E o3) {
        line.add(o1);
        line.add(o2);
        line.add(o3);
        list.add((E) line);
    }
    
    public void push(E o1, E o2, E o3, E o4) {
        line.add(o1);
        line.add(o2);
        line.add(o3);
        list.add(o4);
        list.add((E) line);
    }
    
    public E pop() {
        E o = list.get(getSize()-1);
        list.remove(list.size()-1);
        return o;
    }
    
    public E peek() {
        return list.get(list.size()-1);
    }
    
    public int getSize() {
        return list.size();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public String displayStack() {
        for(E x : list) {
             x.toString();
        }
        return list.toString();
    }
    
    public boolean search(E e) {
        return list.contains(e);
    }
}