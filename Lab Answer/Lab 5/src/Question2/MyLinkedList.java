
package Question2;

public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public MyLinkedList() {
    }
    
    public void add(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public void removeElement(E e) {
        int index = indexOf(e);
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        else if (index == size-1) System.out.println("deleting: " + removeLast());
        else if (index == 0) System.out.println("deleting: " + removeFirst());
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
        }
    }
    
    public void printList() {
        Node<E> cur = head;
        while(cur != null){
            if(cur.equals(tail)) {
                System.out.print(cur.element + ".");
            } else {
                System.out.print(cur.element + ", ");
            }
            cur = cur.next;
            
        }
        System.out.println("");
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean contains(E e) {
        Node<E> temp = head;
        while(temp != null) {
            if(temp.element.equals(e)) return true;
            temp = temp.next;
        }
        return false;
    }
    
    public void replace(E e, E newE) {
        int index = indexOf(e);
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException(); // invalid index
        if (index == 0){
            Node<E> temp = head;
            head.element = newE;
        }
        else{
            Node<E> cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            Node<E> temp = cur;
            cur.element = newE;

        }
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
}
