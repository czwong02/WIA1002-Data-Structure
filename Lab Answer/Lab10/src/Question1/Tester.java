package Question1;

public class Tester {
    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }
    
    public static String substituteAI(String text) {
        if(text.length()==1) {
            return text;
        } else {
            char x = text.charAt(0);
            if(x=='a') {
                return 'i' + substituteAI(text.substring(1));
            } 
            return x + substituteAI(text.substring(1));
        }
    }
}