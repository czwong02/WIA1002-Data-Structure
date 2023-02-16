package Question1;

public class Container<T> {
    private T t;
    
    public Container() {
    }
    
    public void add(T t) {
        this.t = t;
    }
    
    public <T>T retrieve() {
        return (T) t;
    }
  
    
     public static void main(String[] args) {
        Container<Integer> a = new Container<>();
        Container<String> b = new Container<>();
        a.add(50);
        b.add("Java");
         System.out.println((Integer)a.retrieve());
         System.out.println((String)b.retrieve());
    } 
}