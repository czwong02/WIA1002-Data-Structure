package Question7;

import java.util.ArrayList;

public class Tester {
    
    public static void display(ArrayList<?> list) {
        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
    }
}