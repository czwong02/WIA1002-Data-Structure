package readmyletter_u2102792;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_U2102792 {
    public static void main(String[] args) {
        
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("WongChouZi_U2102792.txt", true));
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();
            outputStream.println(text);
            outputStream.close();
        } catch(IOException e) {
            System.out.println("Problem with file output");
        }
        
        try {
            Scanner inputStream = new Scanner(new FileInputStream("WongChouZi_U2102792.txt"));
            while(inputStream.hasNextLine()) {
                String text = inputStream.nextLine();
                System.out.println(text);
                
            }
            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}