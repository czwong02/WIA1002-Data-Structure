package question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text4b {
    public static void main(String[] args) {
    try {
            Scanner inputStream = new Scanner(new FileInputStream("text4.txt"));
            while(inputStream.hasNextLine()) {
                String text = inputStream.nextLine();
                for(int i = 0; i<text.length(); i++) {
                    if(Character.isLetter(text.charAt(i))) {
                        System.out.print(text.charAt(i));
                    } else if(Character.isDigit(text.charAt(i))) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }
}
}