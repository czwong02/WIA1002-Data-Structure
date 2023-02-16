package Question3;

public class CompareMax {
    
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        if(a.compareTo(b) > 0 && a.compareTo(c) > 0) return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) return b;
        else return c;
    }
    
    public static void main(String[] args) {
        System.out.println(maximum(1,2,3));
        System.out.println(maximum('a','b','c'));
    }
}