package question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text1a {
    public static void main(String[] args) {
        int character = 0;
    try {
            Scanner inputStream = new Scanner(new FileInputStream("text1.txt"));
            while(inputStream.hasNextLine()) {
                String text = inputStream.nextLine();
                text = text.replace(",", "");
                for(int i = 0; i<text.length(); i++) {
                    if(Character.isLetter(text.charAt(i))) {
                        character++;
                    }
                }
                
            }
            
            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }
    
        System.out.println("Character: " + character);
}
}