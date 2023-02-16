package SList;

public class TestSList {
    
    public static void main(String[] args) {
        SList<String> list = new SList();
        
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        
        System.out.println("\nThe element in the list: ");
        list.display();
        
        System.out.println("");
        list.removeInitial();
        
        list.clear();
        System.out.println("\nThe element in the list: ");
        list.display();
    }
}