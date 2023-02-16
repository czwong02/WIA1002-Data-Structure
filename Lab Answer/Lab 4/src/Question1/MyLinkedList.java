package Question1;

public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public MyLinkedList() {
    }
    
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }
    
    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) 
                current = current.next;
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    
    public E removeFirst() {
        if (size == 0) return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null) tail = null;
            return temp.element;
        }
    }
    
    public E removeLast() {
        if(size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;
            for (int i = 0; i<size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        else if (index == size-1) return removeLast();
        else if (index == 0) return removeFirst();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public boolean contains(E e) {
        Node<E> temp = head;
        while(temp != null) {
            if(temp.element.equals(e)) return true;
            temp = temp.next;
        }
        return false;
    }
    
    public E get(int index) {
        if (index < 0 || index >= size) return null;
        if(index == 0) return head.element;
        else {
            Node<E> temp = head;
            for (int i = 0; i<index; i++) {
                temp = temp.next;
            }
            return temp.element;
        }
    }
    
    public E getFirst() {
        if (head == null) return null;
        return head.element;
    }
    
    public E getLast() {
        if(tail == null) return null;
        return tail.element;
    }
    
    public int indexOf(E e) {
        int i = 0;
        Node<E> cur = head;
        while(cur != null){
            if (cur.element.equals(e)) return i;
            cur = cur.next;
            i++;
        }
        return -1;
    }
    
    public int lastIndexOf(E e) {
        int i = 0, index = -1;
        Node<E> cur = head;
        while(cur != null){
            if (cur.element.equals(e)){
                index = i;
            };
            cur = cur.next;
            i++;
        }
        return index;
    }
    
    public E set(int index, E e) {
        if (index < 0 || index >= size) return null; // invalid index
        
        else{
            Node<E> cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            Node<E> temp = cur;
            cur.element = e;
            return temp.element;
        }
    }
    
    public void clear() {
        head = tail = null;
        size = 0;
    }
    
    public void print() {
        Node<E> cur = head;
        while(cur != null){
            System.out.print(cur.element + " --> ");
            cur = cur.next;
        }
        System.out.println("");
    }
    
    public void reverse() {
        Node<E> cur = head;
        Object arr[] = new Object[size];
        int i = size - 1;
        while(cur != null){
            arr[i--] = cur.element;
            cur = cur.next;
        }
        for(Object o : arr){
            System.out.print(" <-- " + o);
        }
        System.out.println("");
    }
    
    public E getMiddleValue() {
        int index = size / 2;
        Node<E> cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.element;
    }
}