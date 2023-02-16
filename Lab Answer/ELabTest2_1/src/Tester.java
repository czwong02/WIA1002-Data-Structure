public class Tester {
    public static void main(String[] args) {
        Stack raw = new Stack("Raw list");
        raw.push("ali",32,"m","doctor");
        raw.push("lisa",29,"f","nurse");
        raw.push("tanaka",41);
        raw.push("ahmad",18,"m","developer");
        raw.push("maria",20,"f","accountant");
        raw.push("chong",70,"m","lawyer");
        raw.push("raju",55,"m","police");
        raw.push("alex",16,"f","business man ");
        Person katie = new Person("katie",36,"f","teacher");
        raw.push(katie);
        raw.displayStack();}

}