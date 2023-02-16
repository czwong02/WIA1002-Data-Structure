package Question4;

public class MinMax {
    
    public static <T extends Comparable<T>> String minmax(T[] list) {
        T min = list[0];
        T max = list[0];
        for(T obj: list) {
            if(obj.compareTo(min) < 0) {
                min = obj;
            }
            if(obj.compareTo(max) > 0) {
                max = obj;
            }
        }
        return String.format("Min = %s  Max = %s", min, max);
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}