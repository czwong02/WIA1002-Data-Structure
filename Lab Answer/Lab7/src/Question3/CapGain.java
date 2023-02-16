
package Question3;

public class CapGain {
    private double totalCapGain = 0;
    private Queue sharesHeld = new Queue();
    
    public double getTotalCapGain() {
        return totalCapGain;
    }
    
    public void sell(int shares, int price) { 
        while (shares != 0) {
            int val = sharesHeld.peek().share;
            if (val <= shares) {
                shares -= val;
                totalCapGain += val * (price - sharesHeld.peek().price);
                sharesHeld.dequeue();
            } else {
                int remaining = val - shares;
                totalCapGain += shares * (price - sharesHeld.peek().price);
                shares = 0;
                sharesHeld.peek().share = remaining;
            }
        }
    }
    
    public void buy(int shares, int price) {
        sharesHeld.enqueue(shares, price);
    }
}
