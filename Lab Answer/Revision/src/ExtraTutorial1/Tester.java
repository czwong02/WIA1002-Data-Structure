package ExtraTutorial1;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Tarikh date = new Tarikh(5, 11, 2016);
        System.out.println("Day: " + date.getDay() + " Month: " + date.getMonth() + " Year: " + date.getYear());
        System.out.println("Date is : " + date.toString());
        System.out.println("");
        
        Sentence text = new Sentence("How are you?");
        System.out.println(text.toString());
        System.out.println("The length of the sentence : " + text.getSentenceLength());
        System.out.println("The number of vowels : " + text.getVowel());
        System.out.println("The number of words : " + text.getWord());
        System.out.println("");
        
        SmartPhone []array = {new SmartPhone("iphone",2400) , new SmartPhone("Samsung",2200)
        ,new SmartPhone("Nokia" ,1400) , new SmartPhone("LG",1800)};
        System.out.println("List of Smart Phone:");
        for(SmartPhone s : array){
            System.out.print(s.toString() + " ");
        }
        Arrays.sort(array);
        System.out.println("\nList of Smart Phone in ascending order of the price");
        for(SmartPhone s : array){
            System.out.print(s.toString() + " ");
        }
        System.out.println("");
    }
}