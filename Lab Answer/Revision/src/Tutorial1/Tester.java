
package Tutorial1;

public class Tester {
    public static void main(String[] args) {
        
        Telephone[] phone = {new Telephone("03",79676300), 
                             new Telephone("03",79676301),
                             new Telephone("03",79676302),
                             new Telephone("03",79676303),
                             new Telephone("03",79676304)};
        for(int i = 0; i<phone.length; i++) {
            System.out.println(phone[i].makeFullNumber());
            Telephone.numberOfTelephone++;
        }
        System.out.println("Total number of telephone: " + Telephone.numberOfTelephone);
    }
}
