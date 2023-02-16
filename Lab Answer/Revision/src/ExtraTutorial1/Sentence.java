package ExtraTutorial1;

public class Sentence {
    private String text;

    public Sentence(String text) {
        this.text = text;
    }

    public String toString() {
        return "The sentence is : " + text;
    }
    
    public int getSentenceLength (){
        return text.length();
    }
    
    public int getVowel() {
        int vowel = 0;
        for(int i = 0; i<text.length(); i++) {
            if(text.charAt(i)=='a' || text.charAt(i)=='e' || text.charAt(i)=='i' || text.charAt(i)=='o' || text.charAt(i)=='u') {
                vowel++;
            }
        }
        return vowel;
    }
    
    public int getWord() {
        String[] arr = text.split(" ");
        return arr.length;
    }
}