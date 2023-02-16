package Question3;

public class Tester {
    public static void main(String[] args) {
        System.out.println(exponent(10, 3));
    }
    
    public static long exponent(int x, int m) {
        if(m==1) {
            return x;
        } else {
        return x * exponent(x, m-1);
        }
    }
}