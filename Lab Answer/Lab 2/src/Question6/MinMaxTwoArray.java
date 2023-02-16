package Question6;

public class MinMaxTwoArray {
    
    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];
        for(E[] row: list) {
            for(E obj: row) {
                if(obj.compareTo(min) < 0) {
                    min = obj;
                }
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];
        for(E[] row: list) {
            for(E obj: row) {
                if(obj.compareTo(max) > 0) {
                    max = obj;
                }
            }
        }
        return max;
    }
}