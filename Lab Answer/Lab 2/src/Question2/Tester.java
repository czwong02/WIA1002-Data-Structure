package Question2;

public class Tester {
    public static void main(String[] args) {
    MyGeneric<String> strObj = new MyGeneric<>();
    MyGeneric<Integer> intObj = new MyGeneric<>();
    
    strObj.setE("Welcome");
    intObj.setE(23);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
}
}