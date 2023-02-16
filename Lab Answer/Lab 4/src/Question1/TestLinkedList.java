package Question1;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        
        System.out.println("The element in the list: ");
        list.print();
        
        System.out.println("Reversed element of the list: ");
        list.reverse();
        
        System.out.println("Number of elements in the list: " + list.size);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Remove middle value " + list.remove(list.size/2));
        System.out.println("Index of b in the list: " + list.indexOf('b'));
        System.out.println("Index of c in the list: " + list.indexOf('c'));
        System.out.println("The list has the value c: " + list.contains('c'));
        
        Character[] arr = {'h', 'e', 'l', 'l', 'o'};
        for(int i=0; i<arr.length; i++){
            if (i < list.size) list.set(i, arr[i]);
            else list.add(arr[i]);
        }
        list.print();
        
        System.out.println("The middle element is " + list.getMiddleValue());
    }
}