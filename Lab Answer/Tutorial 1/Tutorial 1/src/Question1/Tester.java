package Question1;

public class Tester {
    public static void main(String[] args) {
    Telephone[] user = new Telephone[5];
    user[0] = new Telephone("03", "79676300");
    user[1] = new Telephone("03", "79676301");
    user[2] = new Telephone("03", "79676302");
    user[3] = new Telephone("03", "79676303");
    user[4] = new Telephone("03", "79676304");
    
    for(Telephone x: user) {
        System.out.println(x.makeFullNumber());
    }
}
}