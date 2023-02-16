package question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text4a {
    public static void main(String[] args) {
        int letter = 0;
    try {
            Scanner inputStream = new Scanner(new FileInputStream("text4.txt"));
                String text = inputStream.nextLine();
                for(int i = 0; i<text.length(); i++) {
                    if(Character.isLetter(text.charAt(i))) {
                        letter++;
                    }
                }
            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }
        System.out.println("Letter: " + letter);
}
}