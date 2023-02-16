package Question6;

public class Duo<A, B> {
    A a;
    B b;

    public Duo(A a, B b) {
        this.a = a;
        this.b = b;
    }   
    
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("wel", 123);
        Duo<Double, Double> points = new Duo<>(12.0, 1432.23);
    }
}