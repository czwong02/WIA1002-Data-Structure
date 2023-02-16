package question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text1b {
    public static void main(String[] args) {
    try {
            Scanner inputStream = new Scanner(new FileInputStream("text1.txt"));
            while(inputStream.hasNextLine()) {
                String text = inputStream.nextLine();
                String[] arr = text.split(",");
                for(int i = 0; i<arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
            }
            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }
}
}