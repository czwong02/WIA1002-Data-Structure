package Question5;

public class FindMax{
    
    public static class Circle implements Comparable<Circle> {
        Double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public int compareTo(Circle o) {
            if(radius > o.radius) {
                return 1;
            } else if(radius < o.radius) {
                return -1;
            }
            return 0;
        }
        
        @Override
        public String toString() {
            return "Circle radius: " + radius;
        }
    }
    
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for(E obj: list) {
            if(obj.compareTo(max) > 0) {
                max = obj;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"red", "green", "blue"};
        Circle[] c = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));
    }
}