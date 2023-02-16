package Question2;

public class MyArray {
    
    public static <T>void listAll(T[] list) {
        for(T obj: list) {
            System.out.print(obj + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
    Integer[] numbers = {1,2,3,4,5};
    String[] names = {"Jane", "Tom", "Bob"};
    Character[] alphabet = {'a', 'b', 'c'};
    
    listAll(numbers);
    listAll(names);
    listAll(alphabet);
}
}