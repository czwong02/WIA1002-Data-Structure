package Question2;

import java.util.Scanner;

public class TestLinkedList {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyLinkedList<String> list = new MyLinkedList();
        System.out.println("Enter your student name list. Enter \'n\' to end......");
        while (true) {
            String name = input.nextLine();
            if(name.equals("n")) break;
            list.add(name);
        }
        System.out.println("\nYou have entered the following students' name :");
        list.printList();
        
        System.out.println("\nThe number of students entered is: " + list.getSize());
        
        System.out.println("\nAll the name entered are correct? Enter \'r\' to rename the student name, \'n\' to proceed");
        String command1 = input.nextLine();
        
        if(command1.equals("r")) {
            System.out.println("\nEnter the existing student name that u want to rename : ");
            String nameReplace = input.nextLine();
            
            System.out.println("\nEnter the new name : ");
            String newName = input.nextLine();
            list.replace(nameReplace, newName);
            
            System.out.println("\nThe new student list is : ");
            list.printList();
        }
        
        System.out.println("\nDo you want to remove any of your student name? Enter \'y\' for yes, \'n\' to proceed");
        String command2 = input.nextLine();
        if(command2.equals("y")) {
            System.out.println("\nEnter a student name to remove : ");
            String nameDeleted = input.nextLine();
            list.removeElement(nameDeleted);
            System.out.println("\nThe number of updated student is :" + list.getSize());
            System.out.println("The updated students list is : ");
            list.printList();
        }
        
        System.out.println("\nAll student data captured completes. Thank you!");
    }
}