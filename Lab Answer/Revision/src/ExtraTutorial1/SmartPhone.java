
package ExtraTutorial1;

class SmartPhone implements Comparable<SmartPhone>{
    private String name ;
    private int price;

    public SmartPhone(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public int compareTo(SmartPhone o) {
        return this.price - o.price;
    }
    
    public String toString(){
        return name + " (RM " + price + ")";
    }
    
}