package Question2;

public class Tester {
    public static void main(String[] args) {
        permuteString("", "ABC");
    }
    
    public static void permuteString(String per, String word) {
        if(word.isEmpty()) {
            System.out.println(per + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permuteString(per + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
        }
        }
    }
}