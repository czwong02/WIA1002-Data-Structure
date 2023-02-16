package question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text3a {
    public static void main(String[] args) {
        int number = 0;
    try {
            Scanner inputStream = new Scanner(new FileInputStream("text3.txt"));
            while(inputStream.hasNextLine()) {
                String text = inputStream.nextLine();
                String[] arr = text.split("; ");
                for(int i = 0; i<arr.length; i++) {
                    number++;
                }
            }
            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }
        System.out.println("Real number: " + number);
}
}